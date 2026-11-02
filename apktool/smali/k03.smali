.class public final synthetic Lk03;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ll03;


# direct methods
.method public synthetic constructor <init>(Ll03;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lk03;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lk03;->Y:Ll03;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lk03;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lk03;->Y:Ll03;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ll03;->d:Lvz7;

    .line 10
    .line 11
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lvk7;

    .line 16
    .line 17
    iget-object p0, p0, Lvk7;->c:Ly45;

    .line 18
    .line 19
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighSpeedVideoSizes()[Landroid/util/Size;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {v1}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object p0, Ld02;->X:Ld02;

    .line 37
    .line 38
    :goto_0
    return-object p0

    .line 39
    :pswitch_0
    iget-object p0, p0, Ll03;->a:Ljj0;

    .line 40
    .line 41
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-object v2, p0

    .line 47
    check-cast v2, Llf0;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    new-instance v1, Lvk7;

    .line 58
    .line 59
    new-instance v2, Lue5;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Lue5;-><init>(Ljj0;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v0, v2}, Lvk7;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lue5;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string p0, "Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP"

    .line 69
    .line 70
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    return-object v1

    .line 74
    :pswitch_1
    iget-object p0, p0, Ll03;->e:Lvz7;

    .line 75
    .line 76
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object p0, v1

    .line 90
    :goto_2
    if-eqz p0, :cond_8

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    move-object v1, v0

    .line 114
    check-cast v1, Landroid/util/Size;

    .line 115
    .line 116
    invoke-static {v1}, Lcb7;->a(Landroid/util/Size;)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v3, v2

    .line 125
    check-cast v3, Landroid/util/Size;

    .line 126
    .line 127
    invoke-static {v3}, Lcb7;->a(Landroid/util/Size;)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-ge v1, v3, :cond_6

    .line 132
    .line 133
    move-object v0, v2

    .line 134
    move v1, v3

    .line 135
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_5

    .line 140
    .line 141
    :goto_3
    move-object v1, v0

    .line 142
    check-cast v1, Landroid/util/Size;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    invoke-static {}, Lbt;->n()V

    .line 146
    .line 147
    .line 148
    :cond_8
    :goto_4
    return-object v1

    .line 149
    :pswitch_2
    iget-object p0, p0, Ll03;->a:Ljj0;

    .line 150
    .line 151
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    check-cast p0, Llf0;

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    check-cast p0, [I

    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    if-eqz p0, :cond_a

    .line 166
    .line 167
    array-length v1, p0

    .line 168
    move v2, v0

    .line 169
    :goto_5
    if-ge v2, v1, :cond_a

    .line 170
    .line 171
    aget v3, p0, v2

    .line 172
    .line 173
    const/16 v4, 0x9

    .line 174
    .line 175
    if-ne v3, v4, :cond_9

    .line 176
    .line 177
    const/4 v0, 0x1

    .line 178
    goto :goto_6

    .line 179
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_a
    :goto_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
