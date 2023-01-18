package ru.geekbrains.lesson6.infrastructure;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database){
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder modelBuilder);

    public boolean saveChanges(){
        //TODO: Сохранение изменений в БД
        return true;
    }

}

class ModelBuilder{

    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
        //TODO: добавление конфигурации маппинга объекта некоторого типа к структуре
        // таблицы БД
        return this;
    }

}
