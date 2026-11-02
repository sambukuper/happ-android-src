.class public final Lsk8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field public static final g0:Lyc0;

.field public static final h0:Lsk8;

.field public static final i0:Lyc0;

.field public static volatile j0:Lsk8;

.field public static final k0:[Ljava/util/Locale;

.field public static final l0:[Lsk8;


# instance fields
.field public volatile transient X:Ljava/util/Locale;

.field public Y:Ljava/lang/String;

.field public volatile transient Z:Le20;

.field public volatile transient f0:Lde4;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lyc0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lyc0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsk8;->g0:Lyc0;

    .line 8
    .line 9
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 10
    .line 11
    sget-object v0, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    .line 12
    .line 13
    sget-object v0, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    .line 14
    .line 15
    sget-object v0, Ljava/util/Locale;->ITALIAN:Ljava/util/Locale;

    .line 16
    .line 17
    sget-object v0, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    .line 18
    .line 19
    sget-object v0, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    .line 20
    .line 21
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 22
    .line 23
    new-instance v0, Lsk8;

    .line 24
    .line 25
    const-string v1, "zh_Hans"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lsk8;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lsk8;

    .line 31
    .line 32
    const-string v1, "zh_Hant"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lsk8;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Ljava/util/Locale;->FRANCE:Ljava/util/Locale;

    .line 38
    .line 39
    sget-object v0, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    .line 40
    .line 41
    sget-object v0, Ljava/util/Locale;->ITALY:Ljava/util/Locale;

    .line 42
    .line 43
    sget-object v0, Ljava/util/Locale;->JAPAN:Ljava/util/Locale;

    .line 44
    .line 45
    sget-object v0, Ljava/util/Locale;->KOREA:Ljava/util/Locale;

    .line 46
    .line 47
    new-instance v0, Lsk8;

    .line 48
    .line 49
    const-string v1, "zh_Hans_CN"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lsk8;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lsk8;

    .line 55
    .line 56
    const-string v1, "zh_Hant_TW"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lsk8;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Ljava/util/Locale;->UK:Ljava/util/Locale;

    .line 62
    .line 63
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 64
    .line 65
    sget-object v0, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    .line 66
    .line 67
    sget-object v0, Ljava/util/Locale;->CANADA_FRENCH:Ljava/util/Locale;

    .line 68
    .line 69
    new-instance v0, Ljava/util/Locale;

    .line 70
    .line 71
    const-string v1, ""

    .line 72
    .line 73
    invoke-direct {v0, v1, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lsk8;

    .line 77
    .line 78
    invoke-direct {v2, v1, v0}, Lsk8;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 79
    .line 80
    .line 81
    sput-object v2, Lsk8;->h0:Lsk8;

    .line 82
    .line 83
    new-instance v0, Lyc0;

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    invoke-direct {v0, v1}, Lyc0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lsk8;->i0:Lyc0;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-static {v1}, Lp61;->G(I)[I

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    array-length v2, v2

    .line 97
    new-array v2, v2, [Ljava/util/Locale;

    .line 98
    .line 99
    sput-object v2, Lsk8;->k0:[Ljava/util/Locale;

    .line 100
    .line 101
    invoke-static {v1}, Lp61;->G(I)[I

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    array-length v2, v2

    .line 106
    new-array v2, v2, [Lsk8;

    .line 107
    .line 108
    sput-object v2, Lsk8;->l0:[Lsk8;

    .line 109
    .line 110
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/4 v3, 0x0

    .line 115
    if-nez v2, :cond_0

    .line 116
    .line 117
    move-object v0, v3

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {v0, v2, v3}, Lcw0;->v0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lsk8;

    .line 124
    .line 125
    :goto_0
    sput-object v0, Lsk8;->j0:Lsk8;

    .line 126
    .line 127
    sget-boolean v0, Lqk8;->a:Z

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    invoke-static {v1}, Lp61;->G(I)[I

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    array-length v1, v0

    .line 137
    :goto_1
    if-ge v4, v1, :cond_6

    .line 138
    .line 139
    aget v2, v0, v4

    .line 140
    .line 141
    invoke-static {v2}, Lp61;->B(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    sget-object v6, Lsk8;->k0:[Ljava/util/Locale;

    .line 146
    .line 147
    sget-boolean v7, Lqk8;->a:Z

    .line 148
    .line 149
    if-eqz v7, :cond_3

    .line 150
    .line 151
    invoke-static {v2}, Lp61;->B(I)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_2

    .line 156
    .line 157
    const/4 v7, 0x1

    .line 158
    if-eq v2, v7, :cond_1

    .line 159
    .line 160
    move-object v2, v3

    .line 161
    goto :goto_2

    .line 162
    :cond_1
    sget-object v2, Lqk8;->d:Ljava/lang/Object;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    sget-object v2, Lqk8;->c:Ljava/lang/Object;

    .line 166
    .line 167
    :goto_2
    if-eqz v2, :cond_3

    .line 168
    .line 169
    :try_start_0
    sget-object v7, Lqk8;->b:Ljava/lang/reflect/Method;

    .line 170
    .line 171
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v7, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ljava/util/Locale;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catch_0
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    :goto_3
    aput-object v2, v6, v5

    .line 187
    .line 188
    sget-object v2, Lsk8;->l0:[Lsk8;

    .line 189
    .line 190
    sget-object v6, Lsk8;->k0:[Ljava/util/Locale;

    .line 191
    .line 192
    aget-object v6, v6, v5

    .line 193
    .line 194
    if-nez v6, :cond_4

    .line 195
    .line 196
    move-object v6, v3

    .line 197
    goto :goto_4

    .line 198
    :cond_4
    sget-object v7, Lsk8;->i0:Lyc0;

    .line 199
    .line 200
    invoke-virtual {v7, v6, v3}, Lcw0;->v0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    check-cast v6, Lsk8;

    .line 205
    .line 206
    :goto_4
    aput-object v6, v2, v5

    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    invoke-static {v1}, Lp61;->G(I)[I

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    array-length v1, v0

    .line 216
    :goto_5
    if-ge v4, v1, :cond_6

    .line 217
    .line 218
    aget v3, v0, v4

    .line 219
    .line 220
    invoke-static {v3}, Lp61;->B(I)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    sget-object v5, Lsk8;->k0:[Ljava/util/Locale;

    .line 225
    .line 226
    aput-object v2, v5, v3

    .line 227
    .line 228
    sget-object v5, Lsk8;->l0:[Lsk8;

    .line 229
    .line 230
    sget-object v6, Lsk8;->j0:Lsk8;

    .line 231
    .line 232
    aput-object v6, v5, v3

    .line 233
    .line 234
    add-int/lit8 v4, v4, 0x1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_6
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lsk8;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lsk8;->Y:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lsk8;->Y:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lsk8;->X:Ljava/util/Locale;

    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x5f

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lfe4;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfe4;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lfe4;->h()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iget-object v0, v0, Lfe4;->c:Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static d()Lsk8;
    .locals 8

    .line 1
    sget-object v0, Lsk8;->j0:Lsk8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lsk8;->h0:Lsk8;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v1, v0, Lsk8;->X:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    const-class v0, Lsk8;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, Lsk8;->j0:Lsk8;

    .line 29
    .line 30
    iget-object v3, v2, Lsk8;->X:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-object v2

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v2, 0x0

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    sget-object v3, Lsk8;->i0:Lyc0;

    .line 47
    .line 48
    invoke-virtual {v3, v1, v2}, Lcw0;->v0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lsk8;

    .line 53
    .line 54
    :goto_0
    sget-boolean v3, Lqk8;->a:Z

    .line 55
    .line 56
    if-nez v3, :cond_4

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-static {v3}, Lp61;->G(I)[I

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    array-length v4, v3

    .line 64
    const/4 v5, 0x0

    .line 65
    :goto_1
    if-ge v5, v4, :cond_4

    .line 66
    .line 67
    aget v6, v3, v5

    .line 68
    .line 69
    invoke-static {v6}, Lp61;->B(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    sget-object v7, Lsk8;->k0:[Ljava/util/Locale;

    .line 74
    .line 75
    aput-object v1, v7, v6

    .line 76
    .line 77
    sget-object v7, Lsk8;->l0:[Lsk8;

    .line 78
    .line 79
    aput-object v2, v7, v6

    .line 80
    .line 81
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    sput-object v2, Lsk8;->j0:Lsk8;

    .line 85
    .line 86
    monitor-exit v0

    .line 87
    return-object v2

    .line 88
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    throw v1
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v6, 0x3

    .line 4
    const-string v7, ""

    .line 5
    .line 6
    const/16 v8, 0x2d

    .line 7
    .line 8
    const/16 v9, 0x5f

    .line 9
    .line 10
    if-eqz v0, :cond_3c

    .line 11
    .line 12
    const-string v1, "@"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_3c

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x1

    .line 26
    move v10, v2

    .line 27
    move v5, v3

    .line 28
    move v11, v5

    .line 29
    move v12, v4

    .line 30
    :goto_0
    if-ge v5, v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v13

    .line 36
    if-eq v13, v9, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    if-eq v13, v8, :cond_1

    .line 43
    .line 44
    if-eqz v12, :cond_0

    .line 45
    .line 46
    move v11, v3

    .line 47
    move v12, v11

    .line 48
    :cond_0
    add-int/2addr v11, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    if-eqz v11, :cond_2

    .line 51
    .line 52
    if-ge v11, v10, :cond_2

    .line 53
    .line 54
    move v10, v11

    .line 55
    :cond_2
    move v12, v4

    .line 56
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    if-ne v10, v4, :cond_3c

    .line 60
    .line 61
    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ltz v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eq v2, v9, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eq v2, v8, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v9, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move-object v2, v0

    .line 85
    :goto_2
    sget-object v5, Lq24;->h:Ljava/util/HashMap;

    .line 86
    .line 87
    new-instance v9, Lou;

    .line 88
    .line 89
    invoke-direct {v9, v2}, Lou;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, [Ljava/lang/String;

    .line 97
    .line 98
    const/4 v10, 0x2

    .line 99
    move v11, v10

    .line 100
    :goto_3
    const/4 v12, -0x1

    .line 101
    if-nez v9, :cond_5

    .line 102
    .line 103
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    invoke-virtual {v2, v8, v11}, Ljava/lang/String;->indexOf(II)I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eq v11, v12, :cond_5

    .line 110
    .line 111
    new-instance v9, Lou;

    .line 112
    .line 113
    invoke-virtual {v2, v3, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-direct {v9, v12}, Lou;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    check-cast v9, [Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    const-string v5, "-"

    .line 128
    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    aget-object v13, v9, v3

    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    if-ne v13, v14, :cond_6

    .line 142
    .line 143
    new-instance v2, Lus5;

    .line 144
    .line 145
    aget-object v9, v9, v4

    .line 146
    .line 147
    invoke-direct {v2, v9, v5}, Lus5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    new-instance v13, Lus5;

    .line 152
    .line 153
    new-instance v14, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    aget-object v9, v9, v4

    .line 159
    .line 160
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-direct {v13, v2, v5}, Lus5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v2, v13

    .line 178
    :goto_4
    move v9, v4

    .line 179
    goto :goto_5

    .line 180
    :cond_7
    new-instance v9, Lus5;

    .line 181
    .line 182
    invoke-direct {v9, v2, v5}, Lus5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move-object v2, v9

    .line 186
    move v9, v3

    .line 187
    :goto_5
    new-instance v11, Lq24;

    .line 188
    .line 189
    invoke-direct {v11}, Lq24;-><init>()V

    .line 190
    .line 191
    .line 192
    iget-boolean v13, v2, Lus5;->c:Z

    .line 193
    .line 194
    const-string v14, "x"

    .line 195
    .line 196
    const/4 v15, 0x4

    .line 197
    if-nez v13, :cond_17

    .line 198
    .line 199
    iget-object v13, v2, Lus5;->f:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v13, Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v13}, Lq24;->a(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v16

    .line 207
    if-eqz v16, :cond_17

    .line 208
    .line 209
    iput-object v13, v11, Lq24;->a:Ljava/lang/String;

    .line 210
    .line 211
    iget v13, v2, Lus5;->b:I

    .line 212
    .line 213
    invoke-virtual {v2}, Lus5;->a()V

    .line 214
    .line 215
    .line 216
    iget-object v8, v11, Lq24;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-gt v8, v6, :cond_a

    .line 223
    .line 224
    iget-boolean v8, v2, Lus5;->c:Z

    .line 225
    .line 226
    if-nez v8, :cond_a

    .line 227
    .line 228
    :goto_6
    iget-boolean v8, v2, Lus5;->c:Z

    .line 229
    .line 230
    if-nez v8, :cond_a

    .line 231
    .line 232
    iget-object v8, v2, Lus5;->f:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v8, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-ne v12, v6, :cond_a

    .line 241
    .line 242
    invoke-static {v8}, Lgv3;->I(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    if-eqz v12, :cond_a

    .line 247
    .line 248
    iget-object v12, v11, Lq24;->e:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-eqz v12, :cond_8

    .line 255
    .line 256
    new-instance v12, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    iput-object v12, v11, Lq24;->e:Ljava/util/List;

    .line 262
    .line 263
    :cond_8
    iget-object v12, v11, Lq24;->e:Ljava/util/List;

    .line 264
    .line 265
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    iget v13, v2, Lus5;->b:I

    .line 269
    .line 270
    invoke-virtual {v2}, Lus5;->a()V

    .line 271
    .line 272
    .line 273
    iget-object v8, v11, Lq24;->e:Ljava/util/List;

    .line 274
    .line 275
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-ne v8, v6, :cond_9

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_9
    const/4 v12, -0x1

    .line 283
    goto :goto_6

    .line 284
    :cond_a
    :goto_7
    iget-boolean v8, v2, Lus5;->c:Z

    .line 285
    .line 286
    if-nez v8, :cond_b

    .line 287
    .line 288
    iget-object v8, v2, Lus5;->f:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v8, Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-ne v12, v15, :cond_b

    .line 297
    .line 298
    invoke-static {v8}, Lgv3;->I(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v12

    .line 302
    if-eqz v12, :cond_b

    .line 303
    .line 304
    iput-object v8, v11, Lq24;->b:Ljava/lang/String;

    .line 305
    .line 306
    iget v13, v2, Lus5;->b:I

    .line 307
    .line 308
    invoke-virtual {v2}, Lus5;->a()V

    .line 309
    .line 310
    .line 311
    :cond_b
    iget-boolean v8, v2, Lus5;->c:Z

    .line 312
    .line 313
    if-nez v8, :cond_c

    .line 314
    .line 315
    iget-object v8, v2, Lus5;->f:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v8, Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v8}, Lq24;->c(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    if-eqz v12, :cond_c

    .line 324
    .line 325
    iput-object v8, v11, Lq24;->c:Ljava/lang/String;

    .line 326
    .line 327
    iget v13, v2, Lus5;->b:I

    .line 328
    .line 329
    invoke-virtual {v2}, Lus5;->a()V

    .line 330
    .line 331
    .line 332
    :cond_c
    iget-boolean v8, v2, Lus5;->c:Z

    .line 333
    .line 334
    if-nez v8, :cond_10

    .line 335
    .line 336
    :goto_8
    iget-boolean v8, v2, Lus5;->c:Z

    .line 337
    .line 338
    if-nez v8, :cond_10

    .line 339
    .line 340
    iget-object v8, v2, Lus5;->f:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v8, Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v8}, Lq24;->d(Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-nez v12, :cond_d

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_d
    iget-object v12, v11, Lq24;->f:Ljava/util/List;

    .line 352
    .line 353
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    if-eqz v12, :cond_e

    .line 358
    .line 359
    new-instance v12, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 362
    .line 363
    .line 364
    iput-object v12, v11, Lq24;->f:Ljava/util/List;

    .line 365
    .line 366
    :cond_e
    invoke-virtual {v8}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    iget-object v12, v11, Lq24;->f:Ljava/util/List;

    .line 371
    .line 372
    invoke-interface {v12, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    if-nez v12, :cond_f

    .line 377
    .line 378
    iget-object v12, v11, Lq24;->f:Ljava/util/List;

    .line 379
    .line 380
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    :cond_f
    iget v13, v2, Lus5;->b:I

    .line 384
    .line 385
    invoke-virtual {v2}, Lus5;->a()V

    .line 386
    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_10
    :goto_9
    iget-boolean v6, v2, Lus5;->c:Z

    .line 390
    .line 391
    if-nez v6, :cond_18

    .line 392
    .line 393
    :goto_a
    iget-boolean v6, v2, Lus5;->c:Z

    .line 394
    .line 395
    if-nez v6, :cond_18

    .line 396
    .line 397
    iget-object v6, v2, Lus5;->f:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v6, Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-ne v8, v4, :cond_18

    .line 406
    .line 407
    invoke-static {v6}, Lgv3;->H(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    if-eqz v8, :cond_18

    .line 412
    .line 413
    invoke-static {v14, v6}, Lgv3;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-nez v8, :cond_18

    .line 418
    .line 419
    iget v8, v2, Lus5;->a:I

    .line 420
    .line 421
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    new-instance v12, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Lus5;->a()V

    .line 431
    .line 432
    .line 433
    :goto_b
    iget-boolean v6, v2, Lus5;->c:Z

    .line 434
    .line 435
    if-nez v6, :cond_11

    .line 436
    .line 437
    iget-object v6, v2, Lus5;->f:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v6, Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-lt v4, v10, :cond_11

    .line 446
    .line 447
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    const/16 v10, 0x8

    .line 452
    .line 453
    if-gt v4, v10, :cond_11

    .line 454
    .line 455
    invoke-static {v6}, Lgv3;->H(Ljava/lang/String;)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eqz v4, :cond_11

    .line 460
    .line 461
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    iget v13, v2, Lus5;->b:I

    .line 468
    .line 469
    invoke-virtual {v2}, Lus5;->a()V

    .line 470
    .line 471
    .line 472
    const/4 v4, 0x1

    .line 473
    const/4 v10, 0x2

    .line 474
    goto :goto_b

    .line 475
    :cond_11
    if-gt v13, v8, :cond_12

    .line 476
    .line 477
    goto :goto_e

    .line 478
    :cond_12
    iget-object v4, v11, Lq24;->g:Ljava/util/List;

    .line 479
    .line 480
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-nez v4, :cond_13

    .line 485
    .line 486
    new-instance v4, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v4, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 489
    .line 490
    .line 491
    iput-object v4, v11, Lq24;->g:Ljava/util/List;

    .line 492
    .line 493
    :cond_13
    iget-object v4, v11, Lq24;->g:Ljava/util/List;

    .line 494
    .line 495
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    move v6, v3

    .line 500
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    if-eqz v8, :cond_15

    .line 505
    .line 506
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    check-cast v8, Ljava/lang/String;

    .line 511
    .line 512
    invoke-virtual {v8, v3}, Ljava/lang/String;->charAt(I)C

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 517
    .line 518
    .line 519
    move-result v10

    .line 520
    if-ne v8, v10, :cond_14

    .line 521
    .line 522
    const/4 v8, 0x1

    .line 523
    goto :goto_d

    .line 524
    :cond_14
    move v8, v3

    .line 525
    :goto_d
    or-int/2addr v6, v8

    .line 526
    goto :goto_c

    .line 527
    :cond_15
    if-nez v6, :cond_16

    .line 528
    .line 529
    iget-object v4, v11, Lq24;->g:Ljava/util/List;

    .line 530
    .line 531
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    :cond_16
    const/4 v4, 0x1

    .line 539
    const/4 v10, 0x2

    .line 540
    goto/16 :goto_a

    .line 541
    .line 542
    :cond_17
    move v13, v3

    .line 543
    :cond_18
    const/4 v8, -0x1

    .line 544
    :goto_e
    iget-boolean v4, v2, Lus5;->c:Z

    .line 545
    .line 546
    if-nez v4, :cond_1d

    .line 547
    .line 548
    if-ltz v8, :cond_19

    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_19
    iget-object v4, v2, Lus5;->f:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v4, Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    const/4 v10, 0x1

    .line 560
    if-ne v6, v10, :cond_1d

    .line 561
    .line 562
    invoke-static {v14, v4}, Lgv3;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    if-eqz v6, :cond_1d

    .line 567
    .line 568
    iget v6, v2, Lus5;->a:I

    .line 569
    .line 570
    new-instance v10, Ljava/lang/StringBuilder;

    .line 571
    .line 572
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2}, Lus5;->a()V

    .line 576
    .line 577
    .line 578
    :goto_f
    iget-boolean v4, v2, Lus5;->c:Z

    .line 579
    .line 580
    if-nez v4, :cond_1b

    .line 581
    .line 582
    iget-object v4, v2, Lus5;->f:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v4, Ljava/lang/String;

    .line 585
    .line 586
    invoke-static {v4}, Lq24;->b(Ljava/lang/String;)Z

    .line 587
    .line 588
    .line 589
    move-result v12

    .line 590
    if-nez v12, :cond_1a

    .line 591
    .line 592
    goto :goto_10

    .line 593
    :cond_1a
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    iget v13, v2, Lus5;->b:I

    .line 600
    .line 601
    invoke-virtual {v2}, Lus5;->a()V

    .line 602
    .line 603
    .line 604
    goto :goto_f

    .line 605
    :cond_1b
    :goto_10
    if-gt v13, v6, :cond_1c

    .line 606
    .line 607
    move v8, v6

    .line 608
    goto :goto_11

    .line 609
    :cond_1c
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    iput-object v4, v11, Lq24;->d:Ljava/lang/String;

    .line 614
    .line 615
    :cond_1d
    :goto_11
    if-eqz v9, :cond_1e

    .line 616
    .line 617
    goto :goto_12

    .line 618
    :cond_1e
    iget-boolean v4, v2, Lus5;->c:Z

    .line 619
    .line 620
    if-nez v4, :cond_20

    .line 621
    .line 622
    if-ltz v8, :cond_1f

    .line 623
    .line 624
    goto :goto_12

    .line 625
    :cond_1f
    iget-object v2, v2, Lus5;->f:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v2, Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    :cond_20
    :goto_12
    new-instance v2, Lig3;

    .line 633
    .line 634
    invoke-direct {v2}, Lig3;-><init>()V

    .line 635
    .line 636
    .line 637
    iput-object v7, v2, Lig3;->a:Ljava/lang/String;

    .line 638
    .line 639
    iput-object v7, v2, Lig3;->b:Ljava/lang/String;

    .line 640
    .line 641
    iput-object v7, v2, Lig3;->c:Ljava/lang/String;

    .line 642
    .line 643
    iput-object v7, v2, Lig3;->d:Ljava/lang/String;

    .line 644
    .line 645
    invoke-virtual {v2}, Lig3;->b()V

    .line 646
    .line 647
    .line 648
    iget-object v4, v11, Lq24;->e:Ljava/util/List;

    .line 649
    .line 650
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    if-lez v4, :cond_21

    .line 659
    .line 660
    iget-object v4, v11, Lq24;->e:Ljava/util/List;

    .line 661
    .line 662
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    check-cast v4, Ljava/lang/String;

    .line 671
    .line 672
    iput-object v4, v2, Lig3;->a:Ljava/lang/String;

    .line 673
    .line 674
    goto :goto_13

    .line 675
    :cond_21
    iget-object v4, v11, Lq24;->a:Ljava/lang/String;

    .line 676
    .line 677
    sget-object v6, Lq24;->h:Ljava/util/HashMap;

    .line 678
    .line 679
    const-string v6, "und"

    .line 680
    .line 681
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    if-nez v6, :cond_22

    .line 686
    .line 687
    iput-object v4, v2, Lig3;->a:Ljava/lang/String;

    .line 688
    .line 689
    :cond_22
    :goto_13
    iget-object v4, v11, Lq24;->b:Ljava/lang/String;

    .line 690
    .line 691
    iput-object v4, v2, Lig3;->b:Ljava/lang/String;

    .line 692
    .line 693
    iget-object v4, v11, Lq24;->c:Ljava/lang/String;

    .line 694
    .line 695
    iput-object v4, v2, Lig3;->c:Ljava/lang/String;

    .line 696
    .line 697
    new-instance v4, Ljava/util/ArrayList;

    .line 698
    .line 699
    iget-object v6, v11, Lq24;->f:Ljava/util/List;

    .line 700
    .line 701
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v6

    .line 705
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 706
    .line 707
    .line 708
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 712
    .line 713
    .line 714
    move-result v6

    .line 715
    const-string v7, "_"

    .line 716
    .line 717
    if-lez v6, :cond_24

    .line 718
    .line 719
    new-instance v6, Ljava/lang/StringBuilder;

    .line 720
    .line 721
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    check-cast v8, Ljava/lang/String;

    .line 726
    .line 727
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    const/4 v10, 0x1

    .line 731
    :goto_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 732
    .line 733
    .line 734
    move-result v8

    .line 735
    if-ge v10, v8, :cond_23

    .line 736
    .line 737
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    check-cast v8, Ljava/lang/String;

    .line 745
    .line 746
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    add-int/lit8 v10, v10, 0x1

    .line 750
    .line 751
    goto :goto_14

    .line 752
    :cond_23
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v4

    .line 756
    iput-object v4, v2, Lig3;->d:Ljava/lang/String;

    .line 757
    .line 758
    :cond_24
    iget-object v4, v11, Lq24;->g:Ljava/util/List;

    .line 759
    .line 760
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    iget-object v6, v11, Lq24;->d:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v2}, Lig3;->b()V

    .line 767
    .line 768
    .line 769
    if-eqz v4, :cond_28

    .line 770
    .line 771
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 772
    .line 773
    .line 774
    move-result v8

    .line 775
    if-lez v8, :cond_28

    .line 776
    .line 777
    new-instance v8, Ljava/util/HashSet;

    .line 778
    .line 779
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 780
    .line 781
    .line 782
    move-result v9

    .line 783
    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(I)V

    .line 784
    .line 785
    .line 786
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    :cond_25
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v9

    .line 794
    if-eqz v9, :cond_28

    .line 795
    .line 796
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v9

    .line 800
    check-cast v9, Ljava/lang/String;

    .line 801
    .line 802
    new-instance v10, Lgg3;

    .line 803
    .line 804
    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    .line 805
    .line 806
    .line 807
    move-result v11

    .line 808
    invoke-direct {v10, v11}, Lgg3;-><init>(C)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v12

    .line 815
    if-nez v12, :cond_25

    .line 816
    .line 817
    sget-object v12, Lwm8;->e:Ljava/util/TreeSet;

    .line 818
    .line 819
    const/16 v12, 0x75

    .line 820
    .line 821
    invoke-static {v11}, Lgv3;->Y(C)C

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    if-ne v12, v11, :cond_26

    .line 826
    .line 827
    const/4 v11, 0x2

    .line 828
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    invoke-virtual {v2, v9}, Lig3;->f(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    goto :goto_15

    .line 836
    :cond_26
    const/4 v11, 0x2

    .line 837
    iget-object v12, v2, Lig3;->e:Ljava/util/HashMap;

    .line 838
    .line 839
    if-nez v12, :cond_27

    .line 840
    .line 841
    new-instance v12, Ljava/util/HashMap;

    .line 842
    .line 843
    invoke-direct {v12, v15}, Ljava/util/HashMap;-><init>(I)V

    .line 844
    .line 845
    .line 846
    iput-object v12, v2, Lig3;->e:Ljava/util/HashMap;

    .line 847
    .line 848
    :cond_27
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v9

    .line 852
    invoke-virtual {v12, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    goto :goto_15

    .line 856
    :cond_28
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 857
    .line 858
    .line 859
    move-result v4

    .line 860
    if-lez v4, :cond_2a

    .line 861
    .line 862
    iget-object v4, v2, Lig3;->e:Ljava/util/HashMap;

    .line 863
    .line 864
    if-nez v4, :cond_29

    .line 865
    .line 866
    new-instance v4, Ljava/util/HashMap;

    .line 867
    .line 868
    const/4 v10, 0x1

    .line 869
    invoke-direct {v4, v10}, Ljava/util/HashMap;-><init>(I)V

    .line 870
    .line 871
    .line 872
    iput-object v4, v2, Lig3;->e:Ljava/util/HashMap;

    .line 873
    .line 874
    goto :goto_16

    .line 875
    :cond_29
    const/4 v10, 0x1

    .line 876
    :goto_16
    new-instance v8, Lgg3;

    .line 877
    .line 878
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    .line 879
    .line 880
    .line 881
    move-result v9

    .line 882
    invoke-direct {v8, v9}, Lgg3;-><init>(C)V

    .line 883
    .line 884
    .line 885
    const/4 v11, 0x2

    .line 886
    invoke-virtual {v6, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    invoke-virtual {v4, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    goto :goto_17

    .line 894
    :cond_2a
    const/4 v10, 0x1

    .line 895
    :goto_17
    iget-object v4, v2, Lig3;->a:Ljava/lang/String;

    .line 896
    .line 897
    iget-object v6, v2, Lig3;->b:Ljava/lang/String;

    .line 898
    .line 899
    iget-object v8, v2, Lig3;->c:Ljava/lang/String;

    .line 900
    .line 901
    iget-object v9, v2, Lig3;->d:Ljava/lang/String;

    .line 902
    .line 903
    iget-object v11, v2, Lig3;->e:Ljava/util/HashMap;

    .line 904
    .line 905
    if-eqz v11, :cond_2f

    .line 906
    .line 907
    sget-object v12, Lig3;->h:Lgg3;

    .line 908
    .line 909
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v11

    .line 913
    check-cast v11, Ljava/lang/String;

    .line 914
    .line 915
    if-eqz v11, :cond_2f

    .line 916
    .line 917
    new-instance v12, Lus5;

    .line 918
    .line 919
    invoke-direct {v12, v11, v5}, Lus5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    move v13, v3

    .line 923
    :goto_18
    iget-boolean v14, v12, Lus5;->c:Z

    .line 924
    .line 925
    if-nez v14, :cond_2d

    .line 926
    .line 927
    if-eqz v13, :cond_2b

    .line 928
    .line 929
    iget v12, v12, Lus5;->a:I

    .line 930
    .line 931
    :goto_19
    const/4 v13, -0x1

    .line 932
    goto :goto_1a

    .line 933
    :cond_2b
    iget-object v14, v12, Lus5;->f:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v14, Ljava/lang/String;

    .line 936
    .line 937
    const-string v15, "lvariant"

    .line 938
    .line 939
    invoke-static {v14, v15}, Lgv3;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 940
    .line 941
    .line 942
    move-result v14

    .line 943
    if-eqz v14, :cond_2c

    .line 944
    .line 945
    move v13, v10

    .line 946
    :cond_2c
    invoke-virtual {v12}, Lus5;->a()V

    .line 947
    .line 948
    .line 949
    goto :goto_18

    .line 950
    :cond_2d
    const/4 v12, -0x1

    .line 951
    goto :goto_19

    .line 952
    :goto_1a
    if-eq v12, v13, :cond_2f

    .line 953
    .line 954
    new-instance v13, Ljava/lang/StringBuilder;

    .line 955
    .line 956
    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 960
    .line 961
    .line 962
    move-result v9

    .line 963
    if-eqz v9, :cond_2e

    .line 964
    .line 965
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    :cond_2e
    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v9

    .line 972
    invoke-virtual {v9, v5, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v5

    .line 976
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v9

    .line 983
    :cond_2f
    invoke-static {v4, v6, v8, v9}, Le20;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le20;

    .line 984
    .line 985
    .line 986
    move-result-object v4

    .line 987
    invoke-virtual {v2}, Lig3;->c()Lde4;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    iget-object v5, v4, Le20;->a:Ljava/lang/String;

    .line 992
    .line 993
    iget-object v6, v4, Le20;->b:Ljava/lang/String;

    .line 994
    .line 995
    iget-object v7, v4, Le20;->c:Ljava/lang/String;

    .line 996
    .line 997
    iget-object v4, v4, Le20;->d:Ljava/lang/String;

    .line 998
    .line 999
    invoke-static {v5, v6, v7, v4}, Lsk8;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    iget-object v6, v2, Lde4;->a:Ljava/util/SortedMap;

    .line 1004
    .line 1005
    invoke-interface {v6}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v6

    .line 1009
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v6

    .line 1013
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v7

    .line 1017
    if-nez v7, :cond_3a

    .line 1018
    .line 1019
    new-instance v7, Ljava/util/TreeMap;

    .line 1020
    .line 1021
    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v6

    .line 1028
    :cond_30
    :goto_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v8

    .line 1032
    if-eqz v8, :cond_37

    .line 1033
    .line 1034
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v8

    .line 1038
    check-cast v8, Ljava/lang/Character;

    .line 1039
    .line 1040
    invoke-virtual {v2, v8}, Lde4;->a(Ljava/lang/Character;)Lm62;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v9

    .line 1044
    instance-of v11, v9, Lwm8;

    .line 1045
    .line 1046
    if-eqz v11, :cond_36

    .line 1047
    .line 1048
    check-cast v9, Lwm8;

    .line 1049
    .line 1050
    iget-object v8, v9, Lwm8;->d:Ljava/util/SortedMap;

    .line 1051
    .line 1052
    invoke-interface {v8}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v8

    .line 1056
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v8

    .line 1060
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v8

    .line 1064
    :goto_1c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1065
    .line 1066
    .line 1067
    move-result v11

    .line 1068
    if-eqz v11, :cond_33

    .line 1069
    .line 1070
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v11

    .line 1074
    check-cast v11, Ljava/lang/String;

    .line 1075
    .line 1076
    iget-object v12, v9, Lwm8;->d:Ljava/util/SortedMap;

    .line 1077
    .line 1078
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v12

    .line 1082
    check-cast v12, Ljava/lang/String;

    .line 1083
    .line 1084
    invoke-static {v11}, Lsk8;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v13

    .line 1088
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1089
    .line 1090
    .line 1091
    move-result v14

    .line 1092
    if-nez v14, :cond_31

    .line 1093
    .line 1094
    const-string v12, "yes"

    .line 1095
    .line 1096
    :cond_31
    invoke-static {v11, v12}, Lsk8;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v11

    .line 1100
    const-string v12, "va"

    .line 1101
    .line 1102
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v12

    .line 1106
    if-eqz v12, :cond_32

    .line 1107
    .line 1108
    const-string v12, "posix"

    .line 1109
    .line 1110
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v12

    .line 1114
    if-eqz v12, :cond_32

    .line 1115
    .line 1116
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1117
    .line 1118
    .line 1119
    move-result v12

    .line 1120
    if-nez v12, :cond_32

    .line 1121
    .line 1122
    const-string v11, "_POSIX"

    .line 1123
    .line 1124
    invoke-virtual {v5, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v5

    .line 1128
    goto :goto_1c

    .line 1129
    :cond_32
    invoke-virtual {v7, v13, v11}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    goto :goto_1c

    .line 1133
    :cond_33
    iget-object v8, v9, Lwm8;->c:Ljava/util/SortedSet;

    .line 1134
    .line 1135
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v8

    .line 1139
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1140
    .line 1141
    .line 1142
    move-result v9

    .line 1143
    if-lez v9, :cond_30

    .line 1144
    .line 1145
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1148
    .line 1149
    .line 1150
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v8

    .line 1154
    :goto_1d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1155
    .line 1156
    .line 1157
    move-result v11

    .line 1158
    if-eqz v11, :cond_35

    .line 1159
    .line 1160
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v11

    .line 1164
    check-cast v11, Ljava/lang/String;

    .line 1165
    .line 1166
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1167
    .line 1168
    .line 1169
    move-result v12

    .line 1170
    if-lez v12, :cond_34

    .line 1171
    .line 1172
    const/16 v12, 0x2d

    .line 1173
    .line 1174
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1175
    .line 1176
    .line 1177
    :cond_34
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    .line 1180
    goto :goto_1d

    .line 1181
    :cond_35
    const-string v8, "attribute"

    .line 1182
    .line 1183
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v9

    .line 1187
    invoke-virtual {v7, v8, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    goto/16 :goto_1b

    .line 1191
    .line 1192
    :cond_36
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v8

    .line 1196
    iget-object v9, v9, Lm62;->b:Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-virtual {v7, v8, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    goto/16 :goto_1b

    .line 1202
    .line 1203
    :cond_37
    invoke-virtual {v7}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1204
    .line 1205
    .line 1206
    move-result v2

    .line 1207
    if-nez v2, :cond_3a

    .line 1208
    .line 1209
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v7}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1226
    .line 1227
    .line 1228
    move-result v4

    .line 1229
    if-eqz v4, :cond_39

    .line 1230
    .line 1231
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v4

    .line 1235
    check-cast v4, Ljava/util/Map$Entry;

    .line 1236
    .line 1237
    if-eqz v3, :cond_38

    .line 1238
    .line 1239
    const-string v5, ";"

    .line 1240
    .line 1241
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1242
    .line 1243
    .line 1244
    goto :goto_1f

    .line 1245
    :cond_38
    move v3, v10

    .line 1246
    :goto_1f
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v5

    .line 1250
    check-cast v5, Ljava/lang/String;

    .line 1251
    .line 1252
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1253
    .line 1254
    .line 1255
    const-string v5, "="

    .line 1256
    .line 1257
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    .line 1260
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    check-cast v4, Ljava/lang/String;

    .line 1265
    .line 1266
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    .line 1269
    goto :goto_1e

    .line 1270
    :cond_39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v5

    .line 1274
    :cond_3a
    new-instance v1, Lsk8;

    .line 1275
    .line 1276
    invoke-direct {v1, v5}, Lsk8;-><init>(Ljava/lang/String;)V

    .line 1277
    .line 1278
    .line 1279
    iget-object v1, v1, Lsk8;->Y:Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1282
    .line 1283
    .line 1284
    move-result v2

    .line 1285
    if-nez v2, :cond_3b

    .line 1286
    .line 1287
    goto :goto_21

    .line 1288
    :cond_3b
    move-object v0, v1

    .line 1289
    goto :goto_21

    .line 1290
    :cond_3c
    const-string v1, "root"

    .line 1291
    .line 1292
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v1

    .line 1296
    if-eqz v1, :cond_3d

    .line 1297
    .line 1298
    :goto_20
    move-object v0, v7

    .line 1299
    goto :goto_21

    .line 1300
    :cond_3d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1301
    .line 1302
    .line 1303
    move-result v8

    .line 1304
    if-ge v8, v6, :cond_3e

    .line 1305
    .line 1306
    goto :goto_21

    .line 1307
    :cond_3e
    const/4 v4, 0x0

    .line 1308
    const/4 v5, 0x3

    .line 1309
    const/4 v1, 0x1

    .line 1310
    const/4 v2, 0x0

    .line 1311
    const-string v3, "und"

    .line 1312
    .line 1313
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v1

    .line 1317
    if-nez v1, :cond_3f

    .line 1318
    .line 1319
    goto :goto_21

    .line 1320
    :cond_3f
    if-ne v8, v6, :cond_40

    .line 1321
    .line 1322
    goto :goto_20

    .line 1323
    :cond_40
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    const/16 v12, 0x2d

    .line 1328
    .line 1329
    if-eq v1, v12, :cond_41

    .line 1330
    .line 1331
    if-ne v1, v9, :cond_42

    .line 1332
    .line 1333
    :cond_41
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    :cond_42
    :goto_21
    sget-object v1, Lsk8;->g0:Lyc0;

    .line 1338
    .line 1339
    const/4 v2, 0x0

    .line 1340
    invoke-virtual {v1, v0, v2}, Lcw0;->v0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    check-cast v0, Ljava/lang/String;

    .line 1345
    .line 1346
    return-object v0
.end method

.method public static h(Lsk8;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x3

    .line 12
    if-lt p1, v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x6

    .line 19
    if-le p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 p1, 0x2

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lrk8;->b:Lrk8;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const-string v1, "[a-zA-Z][a-zA-Z]"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "a"

    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/String;->codePointAt(I)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/String;->codePointAt(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sub-int/2addr v0, v3

    .line 61
    mul-int/lit8 v0, v0, 0x1a

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->codePointAt(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v1, v0

    .line 68
    sub-int/2addr v1, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 v1, -0x1

    .line 71
    :goto_0
    if-gez v1, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object p1, p1, Lrk8;->a:[I

    .line 75
    .line 76
    div-int/lit8 v0, v1, 0x20

    .line 77
    .line 78
    aget p1, p1, v0

    .line 79
    .line 80
    rem-int/lit8 v1, v1, 0x20

    .line 81
    .line 82
    shl-int v0, v2, v1

    .line 83
    .line 84
    and-int/2addr p1, v0

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 89
    return-object p0
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    :cond_0
    const/16 p0, 0x5f

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_1
    if-eqz p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-lez p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_2
    if-eqz p3, :cond_5

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-lez p1, :cond_5

    .line 54
    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_4

    .line 62
    .line 63
    :cond_3
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lux3;->a:[[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lux3;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Llx3;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Llx3;->a:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v1, "[0-9a-zA-Z]+"

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    return-object v0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lux3;->a:[[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lux3;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Llx3;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Llx3;->c:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lsx3;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object p0, v1, Lsx3;->a:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p0, p0, Llx3;->d:Ljava/util/EnumSet;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lqx3;

    .line 53
    .line 54
    iget-object v1, v1, Lqx3;->X:Loc;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Loc;->v(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-static {v0}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 p0, 0x0

    .line 68
    :goto_0
    if-nez p0, :cond_3

    .line 69
    .line 70
    const-string v0, "[0-9a-zA-Z]+([_/\\-][0-9a-zA-Z]+)*"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_3
    return-object p0
.end method


# virtual methods
.method public final b()Le20;
    .locals 5

    .line 1
    iget-object v0, p0, Lsk8;->Z:Le20;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    sget-object v0, Lsk8;->h0:Lsk8;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lsk8;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    new-instance v0, Lfe4;

    .line 14
    .line 15
    iget-object v1, p0, Lsk8;->Y:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lfe4;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lfe4;->m()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lfe4;->j()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iget-object v2, v0, Lfe4;->c:Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0}, Lfe4;->m()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lfe4;->e()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    iput v3, v0, Lfe4;->b:I

    .line 44
    .line 45
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lfe4;->g()C

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-static {v2}, Lfe4;->f(C)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget v2, v0, Lfe4;->b:I

    .line 57
    .line 58
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    iput v2, v0, Lfe4;->b:I

    .line 61
    .line 62
    invoke-virtual {v0}, Lfe4;->k()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iget-object v4, v0, Lfe4;->c:Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0}, Lfe4;->m()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lfe4;->e()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    iput v3, v0, Lfe4;->b:I

    .line 82
    .line 83
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lfe4;->g()C

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v3}, Lfe4;->f(C)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget v3, v0, Lfe4;->b:I

    .line 95
    .line 96
    add-int/lit8 v3, v3, -0x1

    .line 97
    .line 98
    iput v3, v0, Lfe4;->b:I

    .line 99
    .line 100
    invoke-virtual {v0}, Lfe4;->n()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lfe4;->i()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget-object v4, v0, Lfe4;->c:Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v0}, Lfe4;->d()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    const-string v1, ""

    .line 119
    .line 120
    move-object v0, v1

    .line 121
    move-object v2, v0

    .line 122
    move-object v3, v2

    .line 123
    :goto_2
    invoke-static {v1, v2, v3, v0}, Le20;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le20;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p0, Lsk8;->Z:Le20;

    .line 128
    .line 129
    :cond_5
    iget-object p0, p0, Lsk8;->Z:Le20;

    .line 130
    .line 131
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 8

    .line 1
    check-cast p1, Lsk8;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, Le20;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Lsk8;->b()Le20;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, Le20;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, -0x1

    .line 26
    if-nez v1, :cond_a

    .line 27
    .line 28
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, Le20;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1}, Lsk8;->b()Le20;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v4, v4, Le20;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_a

    .line 45
    .line 46
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Le20;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1}, Lsk8;->b()Le20;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v4, v4, Le20;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_a

    .line 63
    .line 64
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, Le20;->d:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p1}, Lsk8;->b()Le20;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v4, v4, Le20;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_a

    .line 81
    .line 82
    invoke-virtual {p0}, Lsk8;->f()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {p1}, Lsk8;->f()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    if-nez v4, :cond_1

    .line 91
    .line 92
    if-nez v5, :cond_9

    .line 93
    .line 94
    move v1, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    if-nez v5, :cond_2

    .line 97
    .line 98
    move v1, v2

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    :goto_0
    if-nez v1, :cond_8

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_8

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_3

    .line 113
    .line 114
    move v1, v2

    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v1, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-nez v7, :cond_7

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p1, v6}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-nez v1, :cond_5

    .line 143
    .line 144
    if-nez v6, :cond_4

    .line 145
    .line 146
    move v1, v0

    .line 147
    goto :goto_0

    .line 148
    :cond_4
    move v1, v3

    .line 149
    goto :goto_0

    .line 150
    :cond_5
    if-nez v6, :cond_6

    .line 151
    .line 152
    move v1, v2

    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {v1, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_0

    .line 159
    :cond_7
    move v1, v7

    .line 160
    goto :goto_0

    .line 161
    :cond_8
    :goto_1
    if-nez v1, :cond_a

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_a

    .line 168
    .line 169
    :cond_9
    move v1, v3

    .line 170
    :cond_a
    :goto_2
    if-gez v1, :cond_b

    .line 171
    .line 172
    return v3

    .line 173
    :cond_b
    if-lez v1, :cond_c

    .line 174
    .line 175
    return v2

    .line 176
    :cond_c
    :goto_3
    return v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lfe4;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lfe4;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lfe4;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lsk8;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 10
    .line 11
    check-cast p1, Lsk8;

    .line 12
    .line 13
    iget-object p1, p1, Lsk8;->Y:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final f()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object p0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Lfe4;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lfe4;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lfe4;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final k()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lsk8;->b()Le20;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lsk8;->f0:Lde4;

    .line 8
    .line 9
    const-string v3, "_"

    .line 10
    .line 11
    const-string v5, "-"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lsk8;->f()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    sget-object v2, Lde4;->d:Lde4;

    .line 24
    .line 25
    iput-object v2, v0, Lsk8;->f0:Lde4;

    .line 26
    .line 27
    :cond_0
    const/16 v16, 0x0

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_1
    new-instance v9, Lig3;

    .line 32
    .line 33
    invoke-direct {v9}, Lig3;-><init>()V

    .line 34
    .line 35
    .line 36
    :catch_0
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    if-eqz v10, :cond_f

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    check-cast v10, Ljava/lang/String;

    .line 47
    .line 48
    const-string v11, "attribute"

    .line 49
    .line 50
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-eqz v11, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v10}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    const-string v11, "[-_]"

    .line 61
    .line 62
    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    array-length v11, v10

    .line 67
    move v12, v8

    .line 68
    :goto_1
    if-ge v12, v11, :cond_3

    .line 69
    .line 70
    aget-object v13, v10, v12

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {v9, v13}, Lig3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lke4; {:try_start_0 .. :try_end_0} :catch_1

    .line 73
    .line 74
    .line 75
    :catch_1
    add-int/lit8 v12, v12, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/16 v16, 0x0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    const/4 v12, 0x2

    .line 86
    if-lt v11, v12, :cond_e

    .line 87
    .line 88
    sget-object v11, Lux3;->a:[[Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v10}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    sget-object v12, Lux3;->b:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    check-cast v11, Llx3;

    .line 101
    .line 102
    if-eqz v11, :cond_5

    .line 103
    .line 104
    iget-object v11, v11, Llx3;->b:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    const/4 v11, 0x0

    .line 108
    :goto_2
    if-nez v11, :cond_6

    .line 109
    .line 110
    invoke-static {v10}, Lwm8;->a(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_6

    .line 115
    .line 116
    invoke-static {v10}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    :cond_6
    invoke-virtual {v0, v10}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    invoke-static {v10}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-static {v13}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    check-cast v10, Llx3;

    .line 137
    .line 138
    if-eqz v10, :cond_9

    .line 139
    .line 140
    iget-object v12, v10, Llx3;->c:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v12, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    check-cast v12, Lsx3;

    .line 147
    .line 148
    if-eqz v12, :cond_7

    .line 149
    .line 150
    iget-object v10, v12, Lsx3;->b:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    iget-object v10, v10, Llx3;->d:Ljava/util/EnumSet;

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    :cond_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-eqz v12, :cond_9

    .line 166
    .line 167
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    check-cast v12, Lqx3;

    .line 172
    .line 173
    iget-object v12, v12, Lqx3;->X:Loc;

    .line 174
    .line 175
    invoke-virtual {v12, v14}, Loc;->v(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    if-eqz v12, :cond_8

    .line 180
    .line 181
    invoke-static {v14}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    goto :goto_3

    .line 186
    :cond_9
    const/4 v10, 0x0

    .line 187
    :goto_3
    if-nez v10, :cond_c

    .line 188
    .line 189
    sget-object v12, Lwm8;->e:Ljava/util/TreeSet;

    .line 190
    .line 191
    move v12, v8

    .line 192
    :goto_4
    invoke-virtual {v13, v5, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-gez v14, :cond_a

    .line 197
    .line 198
    invoke-virtual {v13, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    :goto_5
    const/16 v16, 0x0

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_a
    invoke-virtual {v13, v12, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    goto :goto_5

    .line 210
    :goto_6
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    const/4 v4, 0x3

    .line 215
    if-lt v6, v4, :cond_d

    .line 216
    .line 217
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    const/16 v6, 0x8

    .line 222
    .line 223
    if-gt v4, v6, :cond_d

    .line 224
    .line 225
    invoke-static {v15}, Lgv3;->H(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_d

    .line 230
    .line 231
    if-gez v14, :cond_b

    .line 232
    .line 233
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-ge v12, v4, :cond_d

    .line 238
    .line 239
    invoke-static {v13}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    goto :goto_7

    .line 244
    :cond_b
    add-int/lit8 v12, v14, 0x1

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_c
    const/16 v16, 0x0

    .line 248
    .line 249
    :cond_d
    :goto_7
    if-eqz v11, :cond_2

    .line 250
    .line 251
    if-eqz v10, :cond_2

    .line 252
    .line 253
    :try_start_1
    invoke-virtual {v9, v11, v10}, Lig3;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lke4; {:try_start_1 .. :try_end_1} :catch_0

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_e
    const/16 v16, 0x0

    .line 259
    .line 260
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-ne v4, v7, :cond_2

    .line 265
    .line 266
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    const/16 v6, 0x75

    .line 271
    .line 272
    if-eq v4, v6, :cond_2

    .line 273
    .line 274
    :try_start_2
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-virtual {v0, v10}, Lsk8;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-virtual {v6, v3, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-virtual {v9, v4, v6}, Lig3;->d(CLjava/lang/String;)V
    :try_end_2
    .catch Lke4; {:try_start_2 .. :try_end_2} :catch_0

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_f
    const/16 v16, 0x0

    .line 292
    .line 293
    invoke-virtual {v9}, Lig3;->c()Lde4;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iput-object v2, v0, Lsk8;->f0:Lde4;

    .line 298
    .line 299
    :goto_8
    iget-object v0, v0, Lsk8;->f0:Lde4;

    .line 300
    .line 301
    iget-object v2, v1, Le20;->d:Ljava/lang/String;

    .line 302
    .line 303
    const-string v4, "POSIX"

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-eqz v2, :cond_11

    .line 310
    .line 311
    iget-object v2, v1, Le20;->a:Ljava/lang/String;

    .line 312
    .line 313
    iget-object v4, v1, Le20;->b:Ljava/lang/String;

    .line 314
    .line 315
    iget-object v1, v1, Le20;->c:Ljava/lang/String;

    .line 316
    .line 317
    const-string v6, ""

    .line 318
    .line 319
    invoke-static {v2, v4, v1, v6}, Le20;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le20;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    iget-object v2, v0, Lde4;->a:Ljava/util/SortedMap;

    .line 324
    .line 325
    const/16 v17, 0x75

    .line 326
    .line 327
    invoke-static/range {v17 .. v17}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    check-cast v2, Lm62;

    .line 336
    .line 337
    const-string v4, "va"

    .line 338
    .line 339
    if-nez v2, :cond_10

    .line 340
    .line 341
    move-object/from16 v2, v16

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_10
    check-cast v2, Lwm8;

    .line 345
    .line 346
    invoke-static {v4}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    iget-object v2, v2, Lwm8;->d:Ljava/util/SortedMap;

    .line 351
    .line 352
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    check-cast v2, Ljava/lang/String;

    .line 357
    .line 358
    :goto_9
    if-nez v2, :cond_11

    .line 359
    .line 360
    new-instance v2, Lig3;

    .line 361
    .line 362
    invoke-direct {v2}, Lig3;-><init>()V

    .line 363
    .line 364
    .line 365
    :try_start_3
    sget-object v6, Le20;->g:Le20;

    .line 366
    .line 367
    invoke-virtual {v2, v6, v0}, Lig3;->e(Le20;Lde4;)V

    .line 368
    .line 369
    .line 370
    const-string v0, "posix"

    .line 371
    .line 372
    invoke-virtual {v2, v4, v0}, Lig3;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2}, Lig3;->c()Lde4;

    .line 376
    .line 377
    .line 378
    move-result-object v0
    :try_end_3
    .catch Lke4; {:try_start_3 .. :try_end_3} :catch_2

    .line 379
    goto :goto_a

    .line 380
    :catch_2
    move-exception v0

    .line 381
    invoke-static {v0}, Lu52;->q(Ljava/lang/Throwable;)V

    .line 382
    .line 383
    .line 384
    return-object v16

    .line 385
    :cond_11
    :goto_a
    new-instance v2, Lq24;

    .line 386
    .line 387
    invoke-direct {v2}, Lq24;-><init>()V

    .line 388
    .line 389
    .line 390
    iget-object v4, v1, Le20;->a:Ljava/lang/String;

    .line 391
    .line 392
    iget-object v6, v1, Le20;->b:Ljava/lang/String;

    .line 393
    .line 394
    iget-object v9, v1, Le20;->c:Ljava/lang/String;

    .line 395
    .line 396
    iget-object v1, v1, Le20;->d:Ljava/lang/String;

    .line 397
    .line 398
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    if-lez v10, :cond_15

    .line 403
    .line 404
    invoke-static {v4}, Lq24;->a(Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    if-eqz v10, :cond_15

    .line 409
    .line 410
    const-string v10, "iw"

    .line 411
    .line 412
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    if-eqz v10, :cond_12

    .line 417
    .line 418
    const-string v4, "he"

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_12
    const-string v10, "ji"

    .line 422
    .line 423
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    if-eqz v10, :cond_13

    .line 428
    .line 429
    const-string v4, "yi"

    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_13
    const-string v10, "in"

    .line 433
    .line 434
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-eqz v10, :cond_14

    .line 439
    .line 440
    const-string v4, "id"

    .line 441
    .line 442
    :cond_14
    :goto_b
    iput-object v4, v2, Lq24;->a:Ljava/lang/String;

    .line 443
    .line 444
    :cond_15
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 445
    .line 446
    .line 447
    move-result v4

    .line 448
    const/4 v10, 0x4

    .line 449
    if-lez v4, :cond_16

    .line 450
    .line 451
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-ne v4, v10, :cond_16

    .line 456
    .line 457
    invoke-static {v6}, Lgv3;->I(Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-eqz v4, :cond_16

    .line 462
    .line 463
    invoke-static {v6}, Lgv3;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    iput-object v4, v2, Lq24;->b:Ljava/lang/String;

    .line 468
    .line 469
    move v4, v7

    .line 470
    goto :goto_c

    .line 471
    :cond_16
    move v4, v8

    .line 472
    :goto_c
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    if-lez v6, :cond_17

    .line 477
    .line 478
    invoke-static {v9}, Lq24;->c(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    if-eqz v6, :cond_17

    .line 483
    .line 484
    invoke-static {v9}, Lgv3;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    iput-object v4, v2, Lq24;->c:Ljava/lang/String;

    .line 489
    .line 490
    move v4, v7

    .line 491
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    if-lez v6, :cond_1f

    .line 496
    .line 497
    new-instance v6, Lus5;

    .line 498
    .line 499
    invoke-direct {v6, v1, v3}, Lus5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v1, v16

    .line 503
    .line 504
    :goto_d
    iget-boolean v9, v6, Lus5;->c:Z

    .line 505
    .line 506
    if-nez v9, :cond_1a

    .line 507
    .line 508
    iget-object v9, v6, Lus5;->f:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v9, Ljava/lang/String;

    .line 511
    .line 512
    invoke-static {v9}, Lq24;->d(Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    if-nez v11, :cond_18

    .line 517
    .line 518
    goto :goto_e

    .line 519
    :cond_18
    if-nez v1, :cond_19

    .line 520
    .line 521
    new-instance v1, Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 524
    .line 525
    .line 526
    :cond_19
    invoke-static {v9}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    invoke-virtual {v6}, Lus5;->a()V

    .line 534
    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_1a
    :goto_e
    if-eqz v1, :cond_1b

    .line 538
    .line 539
    iput-object v1, v2, Lq24;->f:Ljava/util/List;

    .line 540
    .line 541
    move v4, v7

    .line 542
    :cond_1b
    iget-boolean v1, v6, Lus5;->c:Z

    .line 543
    .line 544
    if-nez v1, :cond_1f

    .line 545
    .line 546
    new-instance v1, Ljava/lang/StringBuilder;

    .line 547
    .line 548
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 549
    .line 550
    .line 551
    :goto_f
    iget-boolean v9, v6, Lus5;->c:Z

    .line 552
    .line 553
    if-nez v9, :cond_1e

    .line 554
    .line 555
    iget-object v9, v6, Lus5;->f:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v9, Ljava/lang/String;

    .line 558
    .line 559
    invoke-static {v9}, Lq24;->b(Ljava/lang/String;)Z

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    if-nez v11, :cond_1c

    .line 564
    .line 565
    goto :goto_10

    .line 566
    :cond_1c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 567
    .line 568
    .line 569
    move-result v11

    .line 570
    if-lez v11, :cond_1d

    .line 571
    .line 572
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    :cond_1d
    invoke-static {v9}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v9

    .line 579
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6}, Lus5;->a()V

    .line 583
    .line 584
    .line 585
    goto :goto_f

    .line 586
    :cond_1e
    :goto_10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 587
    .line 588
    .line 589
    move-result v6

    .line 590
    if-lez v6, :cond_1f

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    goto :goto_11

    .line 597
    :cond_1f
    move-object/from16 v1, v16

    .line 598
    .line 599
    :goto_11
    iget-object v6, v0, Lde4;->a:Ljava/util/SortedMap;

    .line 600
    .line 601
    invoke-interface {v6}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    move-object/from16 v9, v16

    .line 614
    .line 615
    move-object v11, v9

    .line 616
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v12

    .line 620
    const-string v13, "x"

    .line 621
    .line 622
    if-eqz v12, :cond_22

    .line 623
    .line 624
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v12

    .line 628
    check-cast v12, Ljava/lang/Character;

    .line 629
    .line 630
    invoke-virtual {v0, v12}, Lde4;->a(Ljava/lang/Character;)Lm62;

    .line 631
    .line 632
    .line 633
    move-result-object v14

    .line 634
    invoke-virtual {v12}, Ljava/lang/Character;->charValue()C

    .line 635
    .line 636
    .line 637
    move-result v15

    .line 638
    invoke-static {v15}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v15

    .line 642
    invoke-static {v13, v15}, Lgv3;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 643
    .line 644
    .line 645
    move-result v13

    .line 646
    if-eqz v13, :cond_20

    .line 647
    .line 648
    iget-object v11, v14, Lm62;->b:Ljava/lang/String;

    .line 649
    .line 650
    goto :goto_12

    .line 651
    :cond_20
    if-nez v9, :cond_21

    .line 652
    .line 653
    new-instance v9, Ljava/util/ArrayList;

    .line 654
    .line 655
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 656
    .line 657
    .line 658
    :cond_21
    new-instance v13, Ljava/lang/StringBuilder;

    .line 659
    .line 660
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v12

    .line 667
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    iget-object v12, v14, Lm62;->b:Ljava/lang/String;

    .line 674
    .line 675
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v12

    .line 682
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    goto :goto_12

    .line 686
    :cond_22
    if-eqz v9, :cond_23

    .line 687
    .line 688
    iput-object v9, v2, Lq24;->g:Ljava/util/List;

    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_23
    move v7, v4

    .line 692
    :goto_13
    if-eqz v1, :cond_25

    .line 693
    .line 694
    if-nez v11, :cond_24

    .line 695
    .line 696
    const-string v0, "lvariant-"

    .line 697
    .line 698
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v11

    .line 702
    goto :goto_14

    .line 703
    :cond_24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 704
    .line 705
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    const-string v4, "-lvariant-"

    .line 709
    .line 710
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v11

    .line 724
    :cond_25
    :goto_14
    if-eqz v11, :cond_26

    .line 725
    .line 726
    iput-object v11, v2, Lq24;->d:Ljava/lang/String;

    .line 727
    .line 728
    :cond_26
    iget-object v0, v2, Lq24;->a:Ljava/lang/String;

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    const-string v1, "und"

    .line 735
    .line 736
    if-nez v0, :cond_28

    .line 737
    .line 738
    if-nez v7, :cond_27

    .line 739
    .line 740
    if-nez v11, :cond_28

    .line 741
    .line 742
    :cond_27
    iput-object v1, v2, Lq24;->a:Ljava/lang/String;

    .line 743
    .line 744
    :cond_28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    iget-object v3, v2, Lq24;->a:Ljava/lang/String;

    .line 750
    .line 751
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    if-lez v4, :cond_29

    .line 756
    .line 757
    invoke-static {v3}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    :cond_29
    iget-object v3, v2, Lq24;->b:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    if-lez v4, :cond_2a

    .line 771
    .line 772
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-static {v3}, Lgv3;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    :cond_2a
    iget-object v3, v2, Lq24;->c:Ljava/lang/String;

    .line 783
    .line 784
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    if-lez v4, :cond_2b

    .line 789
    .line 790
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-static {v3}, Lgv3;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    :cond_2b
    iget-object v3, v2, Lq24;->f:Ljava/util/List;

    .line 801
    .line 802
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    new-instance v4, Ljava/util/ArrayList;

    .line 807
    .line 808
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 809
    .line 810
    .line 811
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v4

    .line 822
    if-eqz v4, :cond_2c

    .line 823
    .line 824
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    check-cast v4, Ljava/lang/String;

    .line 829
    .line 830
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    invoke-static {v4}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v4

    .line 837
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    goto :goto_15

    .line 841
    :cond_2c
    iget-object v3, v2, Lq24;->g:Ljava/util/List;

    .line 842
    .line 843
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    if-eqz v4, :cond_31

    .line 856
    .line 857
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    check-cast v4, Ljava/lang/String;

    .line 862
    .line 863
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-static {v4}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    const-string v6, "u-"

    .line 871
    .line 872
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 873
    .line 874
    .line 875
    move-result v6

    .line 876
    if-eqz v6, :cond_30

    .line 877
    .line 878
    :goto_17
    const-string v6, "-true"

    .line 879
    .line 880
    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 881
    .line 882
    .line 883
    move-result v6

    .line 884
    if-eqz v6, :cond_2d

    .line 885
    .line 886
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 887
    .line 888
    .line 889
    move-result v6

    .line 890
    add-int/lit8 v6, v6, -0x5

    .line 891
    .line 892
    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    goto :goto_17

    .line 897
    :cond_2d
    :goto_18
    const-string v6, "-true-"

    .line 898
    .line 899
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 900
    .line 901
    .line 902
    move-result v6

    .line 903
    if-lez v6, :cond_2e

    .line 904
    .line 905
    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v7

    .line 909
    add-int/lit8 v6, v6, 0x5

    .line 910
    .line 911
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v4

    .line 919
    goto :goto_18

    .line 920
    :cond_2e
    :goto_19
    const-string v6, "-yes"

    .line 921
    .line 922
    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 923
    .line 924
    .line 925
    move-result v6

    .line 926
    if-eqz v6, :cond_2f

    .line 927
    .line 928
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    sub-int/2addr v6, v10

    .line 933
    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    goto :goto_19

    .line 938
    :cond_2f
    :goto_1a
    const-string v6, "-yes-"

    .line 939
    .line 940
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 941
    .line 942
    .line 943
    move-result v6

    .line 944
    if-lez v6, :cond_30

    .line 945
    .line 946
    invoke-virtual {v4, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v7

    .line 950
    add-int/lit8 v6, v6, 0x4

    .line 951
    .line 952
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    goto :goto_1a

    .line 961
    :cond_30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    goto :goto_16

    .line 965
    :cond_31
    iget-object v2, v2, Lq24;->d:Ljava/lang/String;

    .line 966
    .line 967
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    if-lez v3, :cond_33

    .line 972
    .line 973
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    if-nez v3, :cond_32

    .line 978
    .line 979
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    :cond_32
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    .line 990
    .line 991
    invoke-static {v2}, Lgv3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    :cond_33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    return-object v0
.end method

.method public final n()Ljava/util/Locale;
    .locals 4

    .line 1
    iget-object v0, p0, Lsk8;->X:Ljava/util/Locale;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Le20;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gtz v1, :cond_1

    .line 18
    .line 19
    const-string v1, "@"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lsk8;->k()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lgv3;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_1
    if-nez v0, :cond_2

    .line 43
    .line 44
    new-instance v0, Ljava/util/Locale;

    .line 45
    .line 46
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Le20;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v2, v2, Le20;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, Lsk8;->b()Le20;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v3, v3, Le20;->d:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v0, v1, v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object v0, p0, Lsk8;->X:Ljava/util/Locale;

    .line 68
    .line 69
    :cond_3
    iget-object p0, p0, Lsk8;->X:Ljava/util/Locale;

    .line 70
    .line 71
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lsk8;->Y:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
