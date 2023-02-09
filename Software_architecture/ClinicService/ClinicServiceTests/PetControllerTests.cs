using ClinicService.Controllers;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClinicServiceTests
{
    public class PetControllerTests
    {
        private PetController _petController;

        public PetControllerTests()
        {
            _petController = new PetController();
        }

        [Fact]
        public void PetCreateBadRequestTest()
        {
            CreatePetRequest createPetRequest = new CreatePetRequest();
            createPetRequest.Birthday = DateTime.Now.AddYears(-35);
            createPetRequest.ClientId = 1;


            ActionResult<int> operationResult = _petController.Create(createPetRequest);

            int expectedOperationValue = 0;

            Assert.IsType<BadRequestObjectResult>(operationResult.Result);
            Assert.Equal<int>(expectedOperationValue, (int)((BadRequestObjectResult)operationResult.Result).Value);
        }

        [Fact]
        public void PetCreateTest()
        {
            // МЕТОД ТЕСТИРОВАНИЯ СОСТОИТ ИЗ УСЛОВНЫХ 3 ЧАСТЕЙ

            // [1] Подготовка данных для тестирования
            CreatePetRequest createPetRequest = new CreatePetRequest();
            createPetRequest.Name = "Персик";
            createPetRequest.Birthday = DateTime.Now.AddYears(-15);
            createPetRequest.ClientId = 1;


            // [2] Исполнение тестируемого метода
            ActionResult<int> operationResult =  _petController.Create(createPetRequest);

            // [3] Подготовка эталонного результата (expected), проверка результата
            int expectedOperationValue = 1;


            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.Equal<int>(expectedOperationValue, (int)((OkObjectResult)operationResult.Result).Value);

        }

        [Theory]
        [InlineData(0)]
        [InlineData(-10)]
        [InlineData(-1000)]
        [InlineData(-54)]
        public void DeletePetBadRequestTest(int petId)
        {
            // [2] Исполнение тестируемого метода
            ActionResult<int> operationResult = _petController.Delete(petId);

            // [3] Подготовка эталонного результата (expected), проверка результата
            int expectedOperationValue = 0;


            Assert.IsType<BadRequestObjectResult>(operationResult.Result);
            Assert.Equal<int>(expectedOperationValue, (int)((BadRequestObjectResult)operationResult.Result).Value);

        }

        [Theory]
        [InlineData(1)]
        [InlineData(10)]
        [InlineData(1000)]
        [InlineData(54)]
        public void DeletePetTest(int petId)
        {
            // [2] Исполнение тестируемого метода
            ActionResult<int> operationResult = _petController.Delete(petId);

            // [3] Подготовка эталонного результата (expected), проверка результата
            int expectedOperationValue = 1;


            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.Equal<int>(expectedOperationValue, (int)((OkObjectResult)operationResult.Result).Value);

        }



    }

    class BaseClass
    {

    }

    class MyClass : BaseClass
    {

    }
}
