<#setting classic_compatible=true>
<#-- 添加的输入框 -->
<div id="lion-add-dialog" class="modal fade">
    <div class="modal-dialog" style="margin: 250px auto;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">添加配置</h4>
            </div>
            <div class="modal-body" style="padding: 20px 70px;">
                <form id="lion-add-dialog-form" class="form-horizontal">
                    <div class="form-group">
                        <label for="projectName" class="col-sm-2 control-label">项目名</label>

                        <div class="col-sm-10">
                            <input readonly="readonly" type="text" class="form-control" id="projectName"
                                   placeholder="项目名"
                                   value="${Request['params'][0]}" name="projectName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="mapKey" class="col-sm-2 control-label">key</label>

                        <div class="col-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon">${Request['params'][0]}.</span>
                                <input type="text" class="form-control" id="mapKey" placeholder="key" value=""
                                       name="mapKey">
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="mapValue" class="col-sm-2 control-label">value</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="mapValue" placeholder="value" value=""
                                   name="mapValue">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="mapDesc" class="col-sm-2 control-label">描述</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="mapDesc" placeholder="desc" value=""
                                   name="mapDesc">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">懒加载</label>

                        <div id="lazy" class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="lazy" value="1"> 是
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="lazy" checked="checked" value="0"> 否
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">环境</label>

                        <div id="envs" class="col-sm-10">
                            <label class="checkbox-inline">
                                <input name="envs" type="checkbox" id="env1" value="1" checked="checked"> 开发
                            </label>
                            <label class="checkbox-inline">
                                <input name="envs" type="checkbox" id="env2" value="2" checked="checked"> ARK
                            </label>
                            <label class="checkbox-inline">
                                <input name="envs" type="checkbox" id="env3" value="3" checked="checked"> 全仿真
                            </label>
                            <label class="checkbox-inline">
                                <input name="envs" type="checkbox" id="env4" value="4" checked="checked"> 线上
                            </label>
                            <label class="checkbox-inline">
                                <input name="envs" type="checkbox" id="env5" value="5" checked="checked"> 性能
                            </label>
                        </div>
                    </div>
                    <input type="hidden" value="${Request['params'][1]}" name="curEnv">
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" onclick="addLionMap(${Request['params'][1]});">添加</button>
            </div>
        </div>
    </div>
</div>