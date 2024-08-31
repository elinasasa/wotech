### HOW DOES MACHINE LEARNING WORK?
## 31.08

## Intro to GPT

- Intro to GenAI, models, people
- RGB example, creating colors
- Tokens and embedding vectors
- Neural nets, simplified, types
- Gradient and optimization
- Encoder-Decoder models, FFN, RNN, LSTM, backpropagation
- Self-Attention and Transformers
- GPT revisited
- Carbon footprint
- Future prospects


AI user database, not internet (mostly)

It generates original information. The model is trained on a large amount of data. 
Each word is a token.

it takes info from what you give and then there answer : "Sure, here is ..." - in this case using sure has 98% probability that its used. after sure, its 97% probability that its "here". it gives signed probabilities what word could be next. 

It takes data from wast databased available publically, 

the GPT isnt trained to remember where the info it takes is comming from. doesnt have a mechanism to remember the source. 

#Examples
- Clause.ai
- llama.meta.com (free)
- Gemini (from google)
- grok (by xAI - elon musk)
- proximity
- ...

## RGB example, creating colors
#How does RGB colour coding works?
Red, green, blue - RGB. the main 3 colours of monitor pixels. you mix them. every pixel has 3 bulbs - RGB
pixel is a combo of RGB together. 

RGB = values are from 0 - 255, where 0 is black, 255 is super bright.

https://www.csfieldguide.org.nz/en/interactives/rgb-mixer/

the values encode the color.

in printing CMYK is used bcs the basic (paper) is white!


## Tokens and embedding vectors

![image](https://github.com/user-attachments/assets/25509ad5-dc8c-4a95-b7da-d6e47f9d33bf)

porition of the word = positional coding. we give coordinates to every tocken - embeding layer. 
one word has the same embeddings in each genrated. each tocken has its own vector of values. in 4D 

WHY does mouse has those specific numbers? 
it works somehow on associations
all words have coordinates

![Image 31-08-2024 at 10 54](https://github.com/user-attachments/assets/845572b2-1f1e-401d-a5db-53f2aef3b2d6)

for example 2D - Tech and Live (human is live and computer would be tech

![Image 31-08-2024 at 11 01](https://github.com/user-attachments/assets/2096f0f0-623d-45f4-a5c6-a86f7306af95)

Water = [0.7, 0.1, 1.0]

in real life there a thousands of dimantions.
but the dimensions for mouse, for example, would change every time depending on the context in which the word appear? - no

## Neural nets, simplified, types

this ti the GPT2 model visualized.
https://poloclub.github.io/transformer-explainer/

if softmax it runs and gets probabilities. that how you get words with probabilities.

#What are neural networks?

imitating brain neurons and their connections.

![image](https://github.com/user-attachments/assets/5a08f399-a0a9-4d6d-9335-df0538411200)

some connections at thicker (in brain physically thincker as well). it carries then more info also - where its thicker. the thicknes is defined in weight.

![image](https://github.com/user-attachments/assets/93405caa-f774-404c-bdb6-51c325c46872)

in this example colour had "heavier" conenctions with RGB, and for exmaple shape not.

https://www.youtube.com/watch?v=N9sF_D0Z5bc

## Training neural network

priving images and telling what it is. proviging millions of data. then you run the neural netowrk and it trains and readjusts the neural connections (the weights). 
its done through gradients.



