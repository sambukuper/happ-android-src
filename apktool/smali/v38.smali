.class public final synthetic Lv38;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb8;Lwj0;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    .line 2
    iput-byte p1, p0, Lv38;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lv38;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lv38;->X:B

    iput-object p1, p0, Lv38;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lv38;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lv38;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lu79;

    .line 12
    .line 13
    iget-object p0, p0, Lu79;->a:Ljj0;

    .line 14
    .line 15
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p0, Llf0;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    move-object v2, p0

    .line 29
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "Required value was null."

    .line 33
    .line 34
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-object v2

    .line 38
    :pswitch_0
    check-cast p0, Landroidx/work/Worker;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/work/Worker;->e()Lcc4;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p0, Ll39;

    .line 46
    .line 47
    invoke-static {p0}, Lq12;->a(Ll39;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_2
    check-cast p0, Landroidx/compose/ui/graphics/vector/VectorPainter;

    .line 52
    .line 53
    iget-object p0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->k0:Lrh5;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :pswitch_3
    check-cast p0, Llr5;

    .line 60
    .line 61
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lik0;

    .line 64
    .line 65
    invoke-virtual {p0}, Lik0;->a()Li26;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-class v0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Li26;->a(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_4
    check-cast p0, Lsu/happ/proxyutility/feature/ui_settings/UISettingsActivity;

    .line 81
    .line 82
    new-instance v0, Lpl8;

    .line 83
    .line 84
    iget-object p0, p0, Lsu/happ/proxyutility/feature/ui_settings/UISettingsActivity;->Q0:Ly5;

    .line 85
    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lpl8;-><init>(Ly5;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_1
    const-string p0, "binding"

    .line 93
    .line 94
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v2

    .line 98
    :pswitch_5
    check-cast p0, Lhb8;

    .line 99
    .line 100
    iget-object v0, p0, Lhb8;->P0:Lgn2;

    .line 101
    .line 102
    iget-boolean p0, p0, Lhb8;->O0:Z

    .line 103
    .line 104
    xor-int/lit8 p0, p0, 0x1

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_6
    check-cast p0, Lf98;

    .line 115
    .line 116
    invoke-virtual {p0}, Lf98;->invoke()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_7
    check-cast p0, Lwj0;

    .line 124
    .line 125
    new-instance v0, Landroid/os/HandlerThread;

    .line 126
    .line 127
    const-string v1, "CXCP-Camera-H"

    .line 128
    .line 129
    const/4 v2, -0x3

    .line 130
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 134
    .line 135
    .line 136
    new-instance v1, Lfl6;

    .line 137
    .line 138
    const/16 v2, 0xe

    .line 139
    .line 140
    invoke-direct {v1, v0, v2}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    sget-object v2, Luj0;->Z:Luj0;

    .line 144
    .line 145
    invoke-virtual {p0, v2, v1}, Lwj0;->a(Luj0;Ljava/lang/Runnable;)V

    .line 146
    .line 147
    .line 148
    new-instance p0, Landroid/os/Handler;

    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_8
    check-cast p0, Ll88;

    .line 159
    .line 160
    iput-object v2, p0, Ll88;->B0:Lk88;

    .line 161
    .line 162
    invoke-static {p0}, Lch3;->I(Lw07;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0}, Lnr4;->E(Lg34;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_9
    check-cast p0, Llf3;

    .line 175
    .line 176
    invoke-virtual {p0}, Llf3;->c()J

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    new-instance p0, Lhf3;

    .line 181
    .line 182
    invoke-direct {p0, v0, v1}, Lhf3;-><init>(J)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_a
    check-cast p0, Lq78;

    .line 187
    .line 188
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 189
    .line 190
    iget-object p0, p0, Lq78;->a:Landroid/view/View;

    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    invoke-direct {v0, p0, v1}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_b
    check-cast p0, La68;

    .line 198
    .line 199
    iget-object v0, p0, La68;->s0:Lkd8;

    .line 200
    .line 201
    iget-object v1, p0, La68;->t0:Lr68;

    .line 202
    .line 203
    iget-object v2, p0, La68;->u0:Ly78;

    .line 204
    .line 205
    iget-object p0, p0, La68;->w0:Lrh5;

    .line 206
    .line 207
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, Lpf3;

    .line 212
    .line 213
    iget-wide v3, p0, Lpf3;->a:J

    .line 214
    .line 215
    invoke-static {v0, v1, v2, v3, v4}, Lbs7;->b(Lkd8;Lr68;Ly78;J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    new-instance p0, Lz85;

    .line 220
    .line 221
    invoke-direct {p0, v0, v1}, Lz85;-><init>(J)V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_c
    check-cast p0, Lw38;

    .line 226
    .line 227
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 228
    .line 229
    if-eqz v0, :cond_2

    .line 230
    .line 231
    invoke-static {p0}, Lp38;->b(Lnh1;)Lg38;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    goto :goto_1

    .line 236
    :cond_2
    sget-object p0, Lg38;->b:Lg38;

    .line 237
    .line 238
    :goto_1
    return-object p0

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
