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

#How does RGB colour coding works?
Red, green, blue - RGB. the main 3 colours of monitor pixels. you mix them. every pixel has 3 bulbs - RGB
pixel is a combo of RGB together. 

RGB = values are from 0 - 255, where 0 is black, 255 is super bright.

https://www.csfieldguide.org.nz/en/interactives/rgb-mixer/

the values encode the color.

in printing CMYK is used bcs the basic (paper) is white!


# Tokens and embedding vectors

![image](https://github.com/user-attachments/assets/25509ad5-dc8c-4a95-b7da-d6e47f9d33bf)

porition of the word = positional coding. we give coordinates to every tocken - embeding layer. 
one word has the same embeddings in each genrated. each tocken has its own vector of values. 
