package org.example.creational.abstract_factory.aws;

import org.example.creational.abstract_factory.Instance;
import org.example.creational.abstract_factory.ResourceFactory;
import org.example.creational.abstract_factory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }


}
