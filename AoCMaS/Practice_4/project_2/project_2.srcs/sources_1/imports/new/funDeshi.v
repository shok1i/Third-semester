`timescale 1ns / 1ps

module funDeshi(
    input a,b,c,d,e,
    output f
    );
wire [1:0] w0;
wire [3:0] w1,w2,w3,w4,w5,w6,w7,w8,w9,w10;

deshi#(1) dc0(.Active({1}),.a({a}),.f(w0));
deshi#(2) dc1(.Active({w0[0]}),.a({b,c}),.f(w1));
deshi#(2) dc2(.Active({w0[1]}),.a({b,c}),.f(w2));
deshi#(2) dc3(.Active({w1[0]}),.a({d,e}),.f(w3)); // 
deshi#(2) dc4(.Active({w1[1]}),.a({d,e}),.f(w4));
deshi#(2) dc5(.Active({w1[2]}),.a({d,e}),.f(w5));
deshi#(2) dc6(.Active({w1[3]}),.a({d,e}),.f(w6));
deshi#(2) dc7(.Active({w2[0]}),.a({d,e}),.f(w7));
deshi#(2) dc8(.Active({w2[1]}),.a({d,e}),.f(w8));
deshi#(2) dc9(.Active({w2[2]}),.a({d,e}),.f(w9));
deshi#(2) dc10(.Active({w2[3]}),.a({d,e}),.f(w10));

assign f =  w3[1] | 
            w4[1] | w4[2] | 
            w5[0] | w5[1] | w5[3] |
            w6[1] | w6[2] |
            w7[0] | w7[3] |
            w8[2] |
            w9[0] | w9[1] | w9[2] | w9[3] |
            w10[2] | w10[3];
endmodule
