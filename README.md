# Barista

To be filled out... but first, let me document the deployment steps

## Setup
```shell script
gcloud init
gcloud auth configure-docker
```

## Deployment

```shell script
./gradlew assemble
docker build -t barista-gke .
docker tag barista-gke eu.gcr.io/$PROJECT_ID/barista-gke
docker push eu.gcr.io/$PROJECT_ID/barista-gke
gcloud container clusters get-credentials $CLUSTER_NAME --zone $ZONE --project $PROJECT_ID
kubectl apply -f deployment.yaml
```