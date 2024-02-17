`timescale 1ns / 1ps

module funMulti(
    input a,b,c,d,e,
    output f
    );
    
wire w0,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13;

                       // ÍÈÇ - ÂÂÅÐÕ
multi #(1) mux0 (.a({d}), .x({1'b0,e}), .f(w0));
multi #(1) mux1 (.a({d}), .x({!e,e}),   .f(w1));
multi #(1) mux2 (.a({d}), .x({e,1'b1}), .f(w2));
multi #(1) mux3 (.a({d}), .x({!e,e}),   .f(w3));
multi #(1) mux4 (.a({d}), .x({e,!e}),   .f(w4));
multi #(1) mux12(.a({d}), .x({!e,1'b0}),.f(w12));

multi #(1) mux5 (.a({c}), .x({w1,w0}), .f(w5));
multi #(1) mux6 (.a({c}), .x({w3,w2}), .f(w6));
multi #(1) mux7 (.a({c}), .x({w12,w4}), .f(w7));
multi #(1) mux8 (.a({c}), .x({d,1'b1}), .f(w8));

multi #(1) mux9 (.a({b}), .x({w6,w5}), .f(w9));
multi #(1) mux10(.a({b}), .x({w8,w7}), .f(w10));

multi #(1) mux11(.a({a}), .x({w10,w9}), .f(f));
endmodule
