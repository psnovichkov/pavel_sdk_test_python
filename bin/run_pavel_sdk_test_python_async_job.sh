#!/bin/bash
export PYTHONPATH=/kb/dev_container/modules/pavel_sdk_test_python/lib:$PATH:$PYTHONPATH
python /kb/dev_container/modules/pavel_sdk_test_python/lib/pavel_sdk_test_python/pavel_sdk_test_pythonServer.py $1 $2 $3
