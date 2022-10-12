package br.com.fiap.checkpoint2.pedido;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.cliente.Cliente;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private PedidoMapper pedidoMapper;

	@PutMapping
	public PedidoCreationDto update(@RequestBody PedidoCreationDto pedido) {
		return pedido;
	}

	@PostMapping
	public PedidoIdDto create(@RequestBody PedidoCreationDto pedidoDto) {

		Pedido pedido = pedidoMapper.toUser(pedidoDto);

		for (String clienteString : pedidoDto.getClientes()) {

			Cliente cliente = new Cliente();
			cliente.setId(UUID.randomUUID().toString());
			cliente.setCodigoCliente(clienteString);
			
			pedido.addCliente(cliente);

		}

		Pedido newUser = pedidoService.add(pedido);

		return new PedidoIdDto(newUser.getId());
	}

	@GetMapping
	public Pedido get() {
		return new Pedido("11/10/2022", "111022", "11/10/2022", "1.000,80");
	}
}
