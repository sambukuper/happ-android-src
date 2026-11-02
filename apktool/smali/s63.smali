.class public final Ls63;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lt63;

.field public c:Ljava/lang/Object;

.field public d:Lr18;

.field public final e:Ljava/util/Map;

.field public f:Ls61;

.field public g:Ls61;

.field public h:Ls61;

.field public i:Lab7;

.field public j:Lpw6;

.field public k:Ltr5;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ls63;->a:Landroid/content/Context;

    .line 55
    sget-object p1, Lt63;->o:Lt63;

    iput-object p1, p0, Ls63;->b:Lt63;

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Ls63;->c:Ljava/lang/Object;

    .line 57
    iput-object p1, p0, Ls63;->d:Lr18;

    .line 58
    sget-object v0, Le02;->X:Le02;

    iput-object v0, p0, Ls63;->e:Ljava/util/Map;

    .line 59
    iput-object p1, p0, Ls63;->f:Ls61;

    .line 60
    iput-object p1, p0, Ls63;->g:Ls61;

    .line 61
    iput-object p1, p0, Ls63;->h:Ls61;

    .line 62
    iput-object p1, p0, Ls63;->i:Lab7;

    .line 63
    iput-object p1, p0, Ls63;->j:Lpw6;

    .line 64
    iput-object p1, p0, Ls63;->k:Ltr5;

    .line 65
    sget-object p1, Ls72;->b:Ls72;

    iput-object p1, p0, Ls63;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv63;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ls63;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object p2, p1, Lv63;->t:Lt63;

    .line 7
    .line 8
    iput-object p2, p0, Ls63;->b:Lt63;

    .line 9
    .line 10
    iget-object p2, p1, Lv63;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Ls63;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p2, p1, Lv63;->c:Lr18;

    .line 15
    .line 16
    iput-object p2, p0, Ls63;->d:Lr18;

    .line 17
    .line 18
    iget-object p2, p1, Lv63;->d:Ljava/util/Map;

    .line 19
    .line 20
    iput-object p2, p0, Ls63;->e:Ljava/util/Map;

    .line 21
    .line 22
    iget-object p2, p1, Lv63;->s:Lu63;

    .line 23
    .line 24
    iget-object v0, p2, Lu63;->a:Ls61;

    .line 25
    .line 26
    iput-object v0, p0, Ls63;->f:Ls61;

    .line 27
    .line 28
    iget-object v0, p2, Lu63;->b:Ls61;

    .line 29
    .line 30
    iput-object v0, p0, Ls63;->g:Ls61;

    .line 31
    .line 32
    iget-object v0, p2, Lu63;->c:Ls61;

    .line 33
    .line 34
    iput-object v0, p0, Ls63;->h:Ls61;

    .line 35
    .line 36
    iget-object v0, p2, Lu63;->d:Lab7;

    .line 37
    .line 38
    iput-object v0, p0, Ls63;->i:Lab7;

    .line 39
    .line 40
    iget-object v0, p2, Lu63;->e:Lpw6;

    .line 41
    .line 42
    iput-object v0, p0, Ls63;->j:Lpw6;

    .line 43
    .line 44
    iget-object p2, p2, Lu63;->f:Ltr5;

    .line 45
    .line 46
    iput-object p2, p0, Ls63;->k:Ltr5;

    .line 47
    .line 48
    iget-object p1, p1, Lv63;->r:Ls72;

    .line 49
    .line 50
    iput-object p1, p0, Ls63;->l:Ljava/lang/Object;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()Lv63;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls63;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, La75;->a:La75;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, Ls63;->d:Lr18;

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v2, v0, Ls63;->e:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lci8;->f(Ljava/lang/Object;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lw51;->P(Ljava/util/Map;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    move-object v6, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    if-eqz v2, :cond_a

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Ls63;->b:Lt63;

    .line 42
    .line 43
    iget-object v7, v1, Lt63;->a:Ls92;

    .line 44
    .line 45
    iget-object v11, v1, Lt63;->e:Lkc0;

    .line 46
    .line 47
    iget-object v12, v1, Lt63;->f:Lkc0;

    .line 48
    .line 49
    iget-object v13, v1, Lt63;->g:Lkc0;

    .line 50
    .line 51
    iget-object v2, v0, Ls63;->f:Ls61;

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-object v2, v1, Lt63;->b:Ls61;

    .line 56
    .line 57
    :cond_2
    move-object v8, v2

    .line 58
    iget-object v2, v0, Ls63;->g:Ls61;

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    iget-object v2, v1, Lt63;->c:Ls61;

    .line 63
    .line 64
    :cond_3
    move-object v9, v2

    .line 65
    iget-object v2, v0, Ls63;->h:Ls61;

    .line 66
    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    iget-object v2, v1, Lt63;->d:Ls61;

    .line 70
    .line 71
    :cond_4
    move-object v10, v2

    .line 72
    sget-object v14, Lve7;->o0:Lve7;

    .line 73
    .line 74
    iget-object v2, v0, Ls63;->i:Lab7;

    .line 75
    .line 76
    if-nez v2, :cond_5

    .line 77
    .line 78
    iget-object v2, v1, Lt63;->k:Lab7;

    .line 79
    .line 80
    :cond_5
    move-object/from16 v17, v2

    .line 81
    .line 82
    iget-object v2, v0, Ls63;->j:Lpw6;

    .line 83
    .line 84
    if-nez v2, :cond_6

    .line 85
    .line 86
    iget-object v2, v1, Lt63;->l:Lpw6;

    .line 87
    .line 88
    :cond_6
    move-object/from16 v18, v2

    .line 89
    .line 90
    iget-object v2, v0, Ls63;->k:Ltr5;

    .line 91
    .line 92
    if-nez v2, :cond_7

    .line 93
    .line 94
    iget-object v2, v1, Lt63;->m:Ltr5;

    .line 95
    .line 96
    :cond_7
    move-object/from16 v19, v2

    .line 97
    .line 98
    iget-object v1, v0, Ls63;->l:Ljava/lang/Object;

    .line 99
    .line 100
    instance-of v2, v1, Lr72;

    .line 101
    .line 102
    if-eqz v2, :cond_8

    .line 103
    .line 104
    check-cast v1, Lr72;

    .line 105
    .line 106
    new-instance v2, Ls72;

    .line 107
    .line 108
    iget-object v1, v1, Lr72;->a:Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-static {v1}, Lw51;->P(Ljava/util/Map;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {v2, v1}, Ls72;-><init>(Ljava/util/Map;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    move-object/from16 v20, v2

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    instance-of v2, v1, Ls72;

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    move-object v2, v1

    .line 125
    check-cast v2, Ls72;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :goto_3
    iget-object v1, v0, Ls63;->f:Ls61;

    .line 129
    .line 130
    iget-object v2, v0, Ls63;->g:Ls61;

    .line 131
    .line 132
    iget-object v3, v0, Ls63;->h:Ls61;

    .line 133
    .line 134
    iget-object v15, v0, Ls63;->i:Lab7;

    .line 135
    .line 136
    move-object/from16 v22, v1

    .line 137
    .line 138
    iget-object v1, v0, Ls63;->j:Lpw6;

    .line 139
    .line 140
    move-object/from16 v26, v1

    .line 141
    .line 142
    iget-object v1, v0, Ls63;->k:Ltr5;

    .line 143
    .line 144
    new-instance v21, Lu63;

    .line 145
    .line 146
    move-object/from16 v27, v1

    .line 147
    .line 148
    move-object/from16 v23, v2

    .line 149
    .line 150
    move-object/from16 v24, v3

    .line 151
    .line 152
    move-object/from16 v25, v15

    .line 153
    .line 154
    invoke-direct/range {v21 .. v27}, Lu63;-><init>(Ls61;Ls61;Ls61;Lab7;Lpw6;Ltr5;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, Ls63;->b:Lt63;

    .line 158
    .line 159
    new-instance v2, Lv63;

    .line 160
    .line 161
    iget-object v3, v0, Ls63;->a:Landroid/content/Context;

    .line 162
    .line 163
    move-object v15, v14

    .line 164
    move-object/from16 v16, v14

    .line 165
    .line 166
    move-object/from16 v22, v1

    .line 167
    .line 168
    invoke-direct/range {v2 .. v22}, Lv63;-><init>(Landroid/content/Context;Ljava/lang/Object;Lr18;Ljava/util/Map;Ls92;Ls61;Ls61;Ls61;Lkc0;Lkc0;Lkc0;Lgn2;Lgn2;Lgn2;Lab7;Lpw6;Ltr5;Ls72;Lu63;Lt63;)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 181
    .line 182
    .line 183
    throw v0
.end method
