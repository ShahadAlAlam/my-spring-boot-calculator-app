# my-spring-boot-calculator-app
Demo calculator project for Spring Boot Assignment
1. Setup environment. Install Idea Ultimate.
2. Create a spring boot project from spring initializr and tinker with it.
3. Make a spring boot project named "calculator". Add 1 Controller and 5 apis (/home, /add, /sub, /mul, /div) in it. (Make sure to give port 8090)
4. Understand the project structure to your heart. Memorize it if you can then self quiz yourself on it. Like "What is the purpose of src folder?"
5. Push the project in github. Give the repo name "my-spring-boot-calculator-app"

## Api Details
    /home(GetMapping)   = curl --location 'http://localhost:8090/home'
    /add(PostMapping)   = curl --location 'http://localhost:8090/add' \
                            --header 'Content-Type: application/json' \
                            --data '{"FirstNumber":10,
                            "SecondNumber":15}'
    /sub(PutMapping)    = curl --location --request PUT 'http://localhost:8090/sub?FirstNumber=10&SecondNumber=15'
    /mul(PostMapping)   = curl --location 'http://localhost:8090/mul' \
                            --header 'Content-Type: application/json' \
                            --data '{"FirstNumber":10,
                            "SecondNumber":15}'
    /div(PostMapping)   = curl --location 'http://localhost:8090/div' \
                            --header 'Content-Type: application/json' \
                            --data '{"FirstNumber":10,
                            "SecondNumber":15}'