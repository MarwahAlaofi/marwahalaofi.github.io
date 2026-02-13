---
title: "On the Use of LLMs for Relevance Labelling"
collection: publications
permalink: /publication/alaofi-2026-on
excerpt: ''
date: 2026-01-19
venue: 'SIGIR'
paperurl: 'http://marwahalaofi.github.io/files/alaofi-2026-on.pdf'
citation: 'Marwah Alaofi, Paul Thomas, Falk Scholer, and Mark Sanderson. 2026. On the Use of LLMs for Relevance Labelling. ACM Trans. Inf. Syst. Just Accepted (January 2026). https://doi.org/10.1145/3788872'
---
## Abstract
In this research, we aim to examine the assumptions made about users when searching for non-factoid answers using search engines. That is, the way they approach non-factoid question-answering tasks, the language they use to express their questions, the variability in their queries and their behavior towards the provided answers. The investigation will also examine the extent to which these neglected factors affect retrieval performance and potentially highlight the importance of building more realistic methodologies and test collections that capture the real nature of this task. Through our preliminary work, we have begun to explore the characteristics of non-factoid question-answering queries and investigate query variability and their impact on modern retrieval models. Our preliminary results demonstrate notable differences between non-factoid questions sampled from a large query log and those used in QA datasets. In addition, our results demonstrate a profound effect of query variability on retrieval consistency, indicating a potential impact on retrieval performance that is worth studying. We highlight the importance of understanding user behaviour while searching for non-factoid answers, specifically the way they behave in response to receiving an answer. This should advance our understanding of the support users require across different types of non-factoid questions and inform the design of interaction models that support learning and encourage exploring.


## Citation
If you find this paper useful, please cite it using the following BibTeX:
```
@article{10.1145/3788872,
author = {Alaofi, Marwah and Thomas, Paul and Scholer, Falk and Sanderson, Mark},
title = {On the Use of LLMs for Relevance Labelling},
year = {2026},
publisher = {Association for Computing Machinery},
address = {New York, NY, USA},
issn = {1046-8188},
url = {https://doi.org/10.1145/3788872},
doi = {10.1145/3788872},
abstract = {Large Language Models (LLMs) are increasingly used to replace human judges to assess the relevance of information objects, raising concerns about circularity, bias, and whether simulated preferences can substitute for human judgement. This work presents experiments using multiple LLMs to label passages for relevance. It examines their gullibility – how easily they are misled into labelling irrelevant passages as relevant. It also compares LLMs with human judges in ranking systems, analysing differences in discriminative power and whether some systems benefit under LLM-based evaluation. Results show that LLMs are influenced by the presence of query terms, even with irrelevant or random passages. Moreover, LLM-generated rankings are highly correlated with those of human judges, with strong agreement on which system is better in pairwise comparisons. However, LLMs may exhibit lower discriminative power, as seen in flatter ranking slopes and missed significance for meaningful improvements. Yet, there are no cases where capable LLMs and human judges reach opposing conclusions with significance. LLMs may boost traditional systems more than neural ones, adding a new concern of system bias. These findings highlight the strong potential of LLMs for relevance labelling, while also highlighting failure cases that call for careful adoption and further research to maintain evaluation integrity.11},
note = {Just Accepted},
journal = {ACM Trans. Inf. Syst.},
month = jan,
keywords = {Information retrieval, test collections, relevance judgements, LLMs}
}
```
