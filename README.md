# RetrofitAPI
Login and Registration using Retrofit
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/a263ee60-7841-41df-b0c8-6d9e0fe789f8)
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/e96eb714-36b1-4552-ac35-bea5a706c351)
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/e0bd1181-6881-4d83-beb4-89fcf816fb46)
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/7c5ca09b-77dd-4958-8f23-2fb0f8dfe437)
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/9ae63477-6d3c-4315-96b1-bca3c45d6ed7)
![image](https://github.com/HarshBytes/RetrofitAPI/assets/137802027/dfaaacc0-12cf-4a8a-9895-682a7eab6c17)

1) 
the network security policy of the Android app does not allow clear-text (non-HTTPS) communication
This is a security feature introduced in Android 9 (API level 28) to promote secure communication.
Create a network security configuration file (res/xml/network_security_config.xml) if it doesn't already exist.
<network-security-config>
    <base-config cleartextTrafficPermitted="true" />
</network-security-config>

2) If you're testing the app on an emulator, you may need to use the IP address 10.0.2.2 to refer to the localhost of your development machine.
If you're testing on a physical device, ensure that the device is connected to the same network as the server and use the appropriate IP address or domain name.
