---
layout: archive
title: "Research"
permalink: /research/
author_profile: true
image: /images/image-alignment-1200x4002.jpg
---

{% if author.googlescholar %}
  You can also find my articles on <u><a href="{{author.googlescholar}}">my Google Scholar profile</a>.</u>
{% endif %}


I have always been fascinated by web search engines and the human element they involve. I am interested in how individuals translate their information needs into different queries and how this influences the relevance and quality of the information they encounter. I examine the extent to which these often-neglected factors affect retrieval performance, with the goal of guiding the development of more realistic, user-centered methodologies and test collections.

---

{% include base_path %}
## 📑 Publications
{% for post in site.publications reversed %}
  {% include archive-single.html %}
{% endfor %}
---
## 📜 Minor Thesis
Inspired by the progress made in web search engines, my minor thesis investigated the potential of using personalization technology in educational library settings as part of [my minor thesis](https://www.dropbox.com/s/gci7ke6ar8rwzc3/MarwahAlaofi-MinorThesis.pdf?dl=0) at [Monash University](https://www.monash.edu). I proposed, developed and evaluated an approach that creates student models which capture their academic interests and respond to their queries with search results re-ranked according to their individual academic interests - I had fun working with users and got interesting results :)
