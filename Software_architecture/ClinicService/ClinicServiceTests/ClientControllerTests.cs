using ClinicService.Controllers;
using ClinicService.Models;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClinicServiceTests
{
    public class ClientControllerTests
    {

        private ClientController _clientController;
        private Mock<IClientRepository> _mockClientRepository;

        public ClientControllerTests()
        {
            _mockClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mockClientRepository.Object);

        }

        [Fact]
        public void GetAllClientsTest()
        {
            // [1] Подготовка данных для тестирования
            _mockClientRepository.Setup(repository =>
                repository.GetAll()).Returns(new List<Client>()
                {
                    new Client(),
                    new Client(),
                    new Client()
                });

            ActionResult<IList<Client>>  operationResult = _clientController.GetAll();


            Assert.IsType<OkObjectResult>(operationResult.Result);

            _mockClientRepository.Verify(repository => repository.GetAll(), Times.Once);

            Assert.IsAssignableFrom<IList<Client>>(((OkObjectResult)operationResult.Result).Value);


        }




    }
}
