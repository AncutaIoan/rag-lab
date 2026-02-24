```bash
├── RagApplication.java
├── config/                     # Spring config
│   ├── AzureOpenAiConfig.java
│   ├── VectorStoreConfig.java
│   └── WebConfig.java
├── rag/                        # RAG feature module
│   ├── api/                    # REST layer
│   │   └── RagController.java
│   │
│   ├── application/            # Use cases (orchestrators)
│   │   ├── AskQuestionUseCase.java
│   │   ├── IngestDocumentUseCase.java
│   │   └── RagService.java
│   │
│   ├── domain/                 # Pure domain logic
│   │   ├── Document.java
│   │   ├── Chunk.java
│   │   └── RagRequest.java
│   │
│   ├── ports/                  # Interfaces (VERY IMPORTANT)
│   │   ├── EmbeddingPort.java
│   │   ├── LlmPort.java
│   │   └── VectorStorePort.java
│   │
│   └── infrastructure/         # Adapters
│       ├── azure/
│       │   ├── AzureOpenAiEmbeddingAdapter.java
│       │   └── AzureOpenAiChatAdapter.java
│       │
│       └── persistence/
│           ├── PgVectorAdapter.java
│           ├── DocumentEntity.java
│           └── DocumentRepository.java
│
└── shared/
    ├── exception/
    └── util/
```