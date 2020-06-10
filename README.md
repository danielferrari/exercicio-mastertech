# exercicio-mastertech

Atividade diagnóstica para Mastertech

## API

### Usuários
GET /ap1/v1/usuarios

GET /ap1/v1/usuarios/{id}

POST /api/v1/usuarios
```json
{
    "nome": "Daniel Ferrari",
    "cpf": "12345678910",
    "email": "danielvictorferrari@gmail.com",
    "dataCadastro": "10-06-2020"
 }
```

PUT /api/v1/usuarios/{id}
```json
{
    "nome": "Daniel Ferrari",
    "cpf": "12345678910",
    "email": "abc@gmail.com",
    "dataCadastro": "10-06-2020"
 }
```

### Ponto

GET /api/v1/ponto/buscarPorUsuario/{idUsuario}

POST /ap1/v1/ponto

```json
{
	"idUsuario": 1,
	"tipo": "saida",
	"dataHora": "11-06-2020 21:00:00"
}
```
