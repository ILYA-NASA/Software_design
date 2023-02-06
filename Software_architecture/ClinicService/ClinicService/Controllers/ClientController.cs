using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using ClinicService.Services.Impl;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.ViewFeatures;

namespace ClinicService.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClientController : ControllerBase
    {

        private IClientRepository _clientRepository;

        public ClientController(IClientRepository clientRepository) { 
            _clientRepository = clientRepository;
        }

        [HttpPost("create")]
        public ActionResult<int> Create([FromBody] CreateClientRequest createClientRequest)
        {
            Client client = new Client();
            client.Document = createClientRequest.Document;
            client.SurName = createClientRequest.SurName;
            client.FirstName = createClientRequest.FirstName;
            client.Patronymic = createClientRequest.Patronymic;
            client.Birthday = createClientRequest.Birthday;
            int res = _clientRepository.Create(client);
            return Ok(res);
        }

        [HttpPut("update")]
        public IActionResult Update([FromBody] UpdateClientRequest updateClientRequest)
        {
            Client client = new Client();
            client.ClientId = updateClientRequest.ClientId;
            client.Document = updateClientRequest.Document;
            client.SurName = updateClientRequest.SurName;
            client.FirstName = updateClientRequest.FirstName;
            client.Patronymic = updateClientRequest.Patronymic;
            client.Birthday = updateClientRequest.Birthday;
            int res = _clientRepository.Update(client);
            return Ok(res);
        }


        [HttpDelete("delete")]
        public ActionResult<int> Delete([FromQuery] int clientId)
        {
            int res = _clientRepository.Delete(clientId);
            return Ok(res);
        }

        [HttpGet("get-all")]
        public ActionResult<IList<Client>> GetAll()
        {
            IList<Client> clients = _clientRepository.GetAll();
            return Ok(clients);
        }

        [HttpGet("get-by-id/{clientId}")]
        public ActionResult<Client> GetById([FromRoute] int clientId)
        {
            Client client = _clientRepository.GetById(clientId);
            return Ok(client);
        }


    }
}
