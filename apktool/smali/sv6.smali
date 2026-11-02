.class public abstract Lsv6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lwe5;

.field public static final b:Lg55;

.field public static final c:Lwe5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwe5;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwe5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsv6;->a:Lwe5;

    .line 9
    .line 10
    new-instance v0, Lg55;

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lg55;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lsv6;->b:Lg55;

    .line 18
    .line 19
    new-instance v0, Lwe5;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lwe5;-><init>(B)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lsv6;->c:Lwe5;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Lsz4;)Lov6;
    .locals 7

    .line 1
    iget-object p0, p0, Lo71;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, Lsv6;->a:Lwe5;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lyv6;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_c

    .line 13
    .line 14
    sget-object v2, Lsv6;->b:Lg55;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lfx8;

    .line 21
    .line 22
    if-eqz v2, :cond_b

    .line 23
    .line 24
    sget-object v3, Lsv6;->c:Lwe5;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/os/Bundle;

    .line 31
    .line 32
    sget-object v4, Ldx8;->a:Ls18;

    .line 33
    .line 34
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p0, :cond_a

    .line 41
    .line 42
    invoke-interface {v0}, Lyv6;->f()Lxd6;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v4, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Lxd6;->s(Ljava/lang/String;)Lwv6;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v4, v0, Ltv6;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    check-cast v0, Ltv6;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v0, v1

    .line 60
    :goto_0
    if-eqz v0, :cond_9

    .line 61
    .line 62
    invoke-static {v2}, Lsv6;->c(Lfx8;)Luv6;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Luv6;->b:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lov6;

    .line 73
    .line 74
    if-nez v4, :cond_8

    .line 75
    .line 76
    invoke-virtual {v0}, Ltv6;->b()V

    .line 77
    .line 78
    .line 79
    iget-object v4, v0, Ltv6;->c:Landroid/os/Bundle;

    .line 80
    .line 81
    if-nez v4, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v4, p0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    new-array v6, v5, [Lqg5;

    .line 99
    .line 100
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, [Lqg5;

    .line 105
    .line 106
    invoke-static {v5}, Ldh3;->h([Lqg5;)Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :cond_3
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    iput-object v1, v0, Ltv6;->c:Landroid/os/Bundle;

    .line 120
    .line 121
    :cond_4
    move-object v1, v5

    .line 122
    :goto_1
    if-nez v1, :cond_5

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    move-object v3, v1

    .line 126
    :goto_2
    if-nez v3, :cond_6

    .line 127
    .line 128
    new-instance v0, Lov6;

    .line 129
    .line 130
    invoke-direct {v0}, Lov6;-><init>()V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    const-class v0, Lov6;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    new-instance v1, Lip4;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Lip4;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_7

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v1, v4, v5}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_7
    invoke-virtual {v1}, Lip4;->b()Lip4;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    new-instance v1, Lov6;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Lov6;-><init>(Lip4;)V

    .line 193
    .line 194
    .line 195
    move-object v0, v1

    .line 196
    :goto_4
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_8
    return-object v4

    .line 201
    :cond_9
    const-string p0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 202
    .line 203
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :cond_a
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 208
    .line 209
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v1

    .line 213
    :cond_b
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 214
    .line 215
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :cond_c
    const-string p0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 220
    .line 221
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-object v1
.end method

.method public static final b(Lyv6;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Ld94;->h()Lg94;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lg94;->i:Lo84;

    .line 6
    .line 7
    sget-object v1, Lo84;->Y:Lo84;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lo84;->Z:Lo84;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Failed to enable `SavedStateHandle` for `"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `"

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    invoke-interface {p0}, Lyv6;->f()Lxd6;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lxd6;->s(Ljava/lang/String;)Lwv6;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Ltv6;

    .line 66
    .line 67
    invoke-interface {p0}, Lyv6;->f()Lxd6;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v3, p0

    .line 72
    check-cast v3, Lfx8;

    .line 73
    .line 74
    invoke-direct {v0, v2, v3}, Ltv6;-><init>(Lxd6;Lfx8;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lyv6;->f()Lxd6;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, v1, v0}, Lxd6;->D(Ljava/lang/String;Lwv6;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0}, Ld94;->h()Lg94;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance v1, Lr86;

    .line 89
    .line 90
    const/4 v2, 0x5

    .line 91
    invoke-direct {v1, v0, v2}, Lr86;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lg94;->a(Lc94;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    return-void
.end method

.method public static final c(Lfx8;)Luv6;
    .locals 3

    .line 1
    new-instance v0, Lrv6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Liz2;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Liz2;

    .line 12
    .line 13
    invoke-interface {v1}, Liz2;->d()Lsz4;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Ln71;->b:Ln71;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Lfx8;->e()Lex8;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v2, Lyr6;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1}, Lyr6;-><init>(Lex8;Lbx8;Lo71;)V

    .line 33
    .line 34
    .line 35
    const-class p0, Luv6;

    .line 36
    .line 37
    sget-object v0, Lyb6;->a:Lzb6;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 44
    .line 45
    invoke-virtual {v2, p0, v0}, Lyr6;->g(Lzu3;Ljava/lang/String;)Lxw8;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Luv6;

    .line 50
    .line 51
    return-object p0
.end method
