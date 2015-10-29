#!/bin/bash
export KB_DEPLOYMENT_CONFIG=/kb/dev_container/modules/pavel_sdk_test_python/deploy.cfg
export PYTHONPATH=/kb/dev_container/modules/pavel_sdk_test_python/lib:$PATH:$PYTHONPATH
uwsgi --master --processes 5 --threads 5 --http :5000 --wsgi-file /kb/dev_container/modules/pavel_sdk_test_python/lib/pavel_sdk_test_python/pavel_sdk_test_pythonServer.py
