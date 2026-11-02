.class public final Li83;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltv2;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Li83;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Ltv2;

    .line 19
    .line 20
    const/16 v1, 0x16

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Li83;->b:Lvz7;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ll81;
    .locals 7

    .line 1
    iget-object p0, p0, Li83;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lh83;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v0, 0x5b

    .line 21
    .line 22
    invoke-static {v0, p0}, Lfm7;->G0(CLjava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 v0, 0x0

    .line 27
    :try_start_0
    invoke-static {p1}, Lz51;->L(Ljava/lang/String;)Lbo3;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    instance-of v2, v1, Len3;

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Lbo3;->b()Len3;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, Len3;->X:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    move v1, v0

    .line 49
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lbo3;

    .line 60
    .line 61
    sget-object v6, Lkw2;->a:Lkw2;

    .line 62
    .line 63
    sget-object v6, Lkw4;->a:Lkw4;

    .line 64
    .line 65
    invoke-static {}, Lkw4;->g()Lcom/google/gson/a;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6, v2}, Lcom/google/gson/a;->g(Lbo3;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2, v3, v4}, Lkw2;->b(Ljava/lang/String;ILjava/lang/String;)Lsu/happ/proxyutility/dto/ImportResult;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-lez v2, :cond_0

    .line 82
    .line 83
    move v1, v5

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    new-instance p1, Ll81;

    .line 88
    .line 89
    invoke-direct {p1, v5, v1}, Ll81;-><init>(ZZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_2
    new-instance v1, Ll81;

    .line 94
    .line 95
    sget-object v2, Lkw2;->a:Lkw2;

    .line 96
    .line 97
    invoke-static {p1, v3, v4}, Lkw2;->b(Ljava/lang/String;ILjava/lang/String;)Lsu/happ/proxyutility/dto/ImportResult;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-lez p1, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move v5, v0

    .line 109
    :goto_1
    invoke-direct {v1, v0, v5}, Ll81;-><init>(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_2
    instance-of v1, p1, Ljava/lang/InterruptedException;

    .line 114
    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 118
    .line 119
    if-nez v1, :cond_5

    .line 120
    .line 121
    new-instance v1, Lrj6;

    .line 122
    .line 123
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_3
    move-object p1, v1

    .line 127
    :goto_4
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-nez v1, :cond_4

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_4
    new-instance p1, Ll81;

    .line 135
    .line 136
    invoke-direct {p1, p0, v0}, Ll81;-><init>(ZZ)V

    .line 137
    .line 138
    .line 139
    :goto_5
    check-cast p1, Ll81;

    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_5
    throw p1
.end method
