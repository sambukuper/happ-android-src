.class public final Lhl0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfg3;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ll91;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll91;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhl0;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lhl0;->b:Ll91;

    .line 13
    .line 14
    new-instance p1, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lhl0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p1, Le02;->X:Le02;

    .line 22
    .line 23
    iput-object p1, p0, Lhl0;->d:Ljava/util/Map;

    .line 24
    .line 25
    :try_start_0
    check-cast p3, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-static {p3}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lhl0;->a(Ljava/util/List;)V
    :try_end_0
    .catch Lll0; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p0

    .line 36
    new-instance p1, Lpc3;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lhl0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhl0;->d:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {p1, v1}, Lwv0;->E0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    monitor-exit v0

    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "CXCP"

    .line 24
    .line 25
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lhl0;->b:Ll91;

    .line 35
    .line 36
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :try_start_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0}, Ll91;->a()Lzh0;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v3}, Lvi0;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v3}, Lzh0;->b(Lzh0;Ljava/lang/String;)Ljj0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-object v6, v4

    .line 81
    check-cast v6, Llf0;

    .line 82
    .line 83
    invoke-virtual {v6, v5}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 88
    .line 89
    new-instance v6, Lik0;

    .line 90
    .line 91
    new-instance v7, Lvk7;

    .line 92
    .line 93
    new-instance v8, Lue5;

    .line 94
    .line 95
    invoke-direct {v8, v4}, Lue5;-><init>(Ljj0;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v7, v5, v8}, Lvk7;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;Lue5;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v6, v4, v7}, Lik0;-><init>(Ljj0;Lvk7;)V

    .line 102
    .line 103
    .line 104
    new-instance v5, Lmx7;

    .line 105
    .line 106
    iget-object v7, p0, Lhl0;->a:Landroid/content/Context;

    .line 107
    .line 108
    new-instance v8, Lx02;

    .line 109
    .line 110
    invoke-virtual {v6}, Lik0;->a()Li26;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-direct {v8, v3, v9}, Lx02;-><init>(Ljava/lang/String;Li26;)V

    .line 115
    .line 116
    .line 117
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    const/16 v10, 0x23

    .line 120
    .line 121
    if-lt v9, v10, :cond_2

    .line 122
    .line 123
    new-instance v9, Llr;

    .line 124
    .line 125
    iget-object v10, v0, Ll91;->a:Lfu6;

    .line 126
    .line 127
    iget-object v10, v10, Lfu6;->f0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Lrj0;

    .line 130
    .line 131
    invoke-static {v10}, Lhi5;->R(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const/16 v11, 0x1b

    .line 135
    .line 136
    invoke-direct {v9, v4, v10, v6, v11}, Llr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    sget-object v9, Lm82;->o:Lk42;

    .line 141
    .line 142
    :goto_1
    invoke-direct {v5, v7, v4, v8, v9}, Lmx7;-><init>(Landroid/content/Context;Ljj0;Lw02;Lm82;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lms1; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_3
    :goto_2
    iget-object v0, p0, Lhl0;->c:Ljava/lang/Object;

    .line 150
    .line 151
    monitor-enter v0

    .line 152
    :try_start_2
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_5

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Ljava/lang/String;

    .line 172
    .line 173
    iget-object v4, p0, Lhl0;->d:Ljava/util/Map;

    .line 174
    .line 175
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_4

    .line 180
    .line 181
    iget-object v4, p0, Lhl0;->d:Ljava/util/Map;

    .line 182
    .line 183
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :catchall_0
    move-exception p0

    .line 195
    goto :goto_4

    .line 196
    :cond_5
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 197
    .line 198
    .line 199
    iput-object v1, p0, Lhl0;->d:Ljava/util/Map;

    .line 200
    .line 201
    const-string p0, "CXCP"

    .line 202
    .line 203
    invoke-static {p0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-eqz p0, :cond_6

    .line 208
    .line 209
    invoke-interface {v1}, Ljava/util/Map;->size()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    .line 211
    .line 212
    :cond_6
    monitor-exit v0

    .line 213
    return-void

    .line 214
    :goto_4
    monitor-exit v0

    .line 215
    throw p0

    .line 216
    :catch_0
    move-exception p0

    .line 217
    new-instance p1, Lll0;

    .line 218
    .line 219
    const-string v0, "Failed to build surface combinations"

    .line 220
    .line 221
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :catch_1
    move-exception p0

    .line 226
    new-instance p1, Lll0;

    .line 227
    .line 228
    const-string v0, "Failed to query camera metadata"

    .line 229
    .line 230
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :catchall_1
    move-exception p0

    .line 235
    monitor-exit v0

    .line 236
    throw p0
.end method
