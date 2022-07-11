Данное REST-API приложение представляет собой спрочник различных транспортных средств.

В предметной области определен общий абстрактный класс AbstractEntity, содержащий общий свойства транспортных средств. От него наследуется класс Vehicle, а  от Vehicle конкретные транспортные средства - Car, Bus. Стратегия между классами Vehicle выбрана JOINED. Это обусловлено тем, что пользователю помимо получения определенных транспортных средств будет необходимо видеть и работать со всеми имеющимися экземплярами каждого типа. Кроме того такой подход облегчает добавление новых объектов предметной области.

Репозитории унаследованы от интерфейса JpaRepository. В котором уже определены все основные методы взаимодействия с персистеным хранилищем.

На данный момент создано два вида сервисов:  
Сервисы первого типа наследуются от одного общего абстрактного сервиса AbstractService в котором определены все необходимые операции.Это обусловлено тем, что с каждой сущностью предметной предполагается ряд одниковых действий(получить, сохранить и тд.), поэтому они вынесены в общий класс. При необходимости можно будет определить отдельные методы.  
  Сервис второго типа - это статисчтиеский сервис, который предоставляет информацию о таблицах сущностей. Содержит один параметризированный метод для получения статистиски выбранного объекта предметной области.  

Контроллеры построены по логике сервисов и наследуются от одного базового контроллера в котором опредлена основная логика.  
Создано несколько эндпоинтов:  
 GET - получение всех экземпляров определенного транспортного средства  
 POST - добавление определенного экземпляра транспортного средства  
 DELETE - удаление определенного экземпляра транспортного средства  
Пример: api/cars или api/cars/{id}  
	
Написаны тесты для сервисов и вспомогательных классов.
