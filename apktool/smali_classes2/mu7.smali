.class public final Lmu7;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Loh7;

.field public final c:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgu7;->a:Lgu7;

    .line 5
    .line 6
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lmu7;->b:Loh7;

    .line 11
    .line 12
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lmu7;->c:Lh76;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e(Llu7;)V
    .locals 7

    .line 1
    instance-of v0, p1, Liu7;

    .line 2
    .line 3
    const-string v1, "pref_use_legacy_okhttp"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "pref_reject_duplicates_subscription"

    .line 7
    .line 8
    iget-object p0, p0, Lmu7;->b:Loh7;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object p1, Lkw4;->a:Lkw4;

    .line 14
    .line 15
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, v3, v2}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v1, v4}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object v1, p1

    .line 39
    check-cast v1, Lhu7;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, Lfu7;

    .line 45
    .line 46
    invoke-direct {v1, v0, v5}, Lfu7;-><init>(ZZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    instance-of v0, p1, Lju7;

    .line 57
    .line 58
    sget-object v5, Lgu7;->a:Lgu7;

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    check-cast p1, Lju7;

    .line 63
    .line 64
    iget-boolean p1, p1, Lju7;->a:Z

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v1, v0

    .line 74
    check-cast v1, Lhu7;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v2, v1, Lfu7;

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    check-cast v1, Lfu7;

    .line 84
    .line 85
    const/4 v2, 0x2

    .line 86
    invoke-static {v1, p1, v4, v2}, Lfu7;->a(Lfu7;ZZI)Lfu7;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    instance-of v1, v1, Lgu7;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    move-object v1, v5

    .line 96
    :goto_0
    invoke-virtual {p0, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    sget-object p0, Lkw4;->a:Lkw4;

    .line 103
    .line 104
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, v3, p1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_5
    instance-of v0, p1, Lku7;

    .line 117
    .line 118
    if-eqz v0, :cond_9

    .line 119
    .line 120
    check-cast p1, Lku7;

    .line 121
    .line 122
    iget-boolean p1, p1, Lku7;->a:Z

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    :cond_6
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    move-object v3, v0

    .line 132
    check-cast v3, Lhu7;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    instance-of v6, v3, Lfu7;

    .line 138
    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    check-cast v3, Lfu7;

    .line 142
    .line 143
    invoke-static {v3, v4, p1, v2}, Lfu7;->a(Lfu7;ZZI)Lfu7;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    goto :goto_1

    .line 148
    :cond_7
    instance-of v3, v3, Lgu7;

    .line 149
    .line 150
    if-eqz v3, :cond_8

    .line 151
    .line 152
    move-object v3, v5

    .line 153
    :goto_1
    invoke-virtual {p0, v0, v3}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    sget-object p0, Lkw4;->a:Lkw4;

    .line 160
    .line 161
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0, v1, p1}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_8
    invoke-static {}, Lb61;->c()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_9
    invoke-static {}, Lb61;->c()V

    .line 174
    .line 175
    .line 176
    return-void
.end method
