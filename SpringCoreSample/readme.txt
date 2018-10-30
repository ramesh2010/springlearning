Bean Class->Xml file->Demo class->Load jarfiles->Run

2 types of IoC container:
------------------------
BeanFactory			: constructs objects when request for object is called where as
ApplicationContext	: constructs objects up front

So,spring container takes care of:
   ----------------
1. objects creation
2. wiring them together
3. managing objects
4. configuring them


Dependency Injection
--------------------

It is a design pattern which removes the dependency from the programming code, that makes the Application easy to manage and test
Dependency Injection makes our programming code loosely coupled, which means change in implementation doesn't affects the user.
