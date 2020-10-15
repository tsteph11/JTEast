application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
  }
  test{
    short_name = "test"
    long_name = "Test"
    release_name = "banana"

  }
  prod{
    short_name = "prod"
    long_name = "Production"
  }
}
libraries{
  sdp{
    images{
        registry = "https://docker.pkg.github.com" 
        repository = "tsteph11/sdp-images" 
        cred = "all" 
      }
  }
  github
  kubernetes{
    k8s_credential = "mini"
    k8s_context = "minikube"
    helm_configuration_repository = "https://github.com/tsteph11/helm.git"
    helm_configuration_repository_credential = "all"
  }
}
