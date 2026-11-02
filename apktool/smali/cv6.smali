.class public final Lcv6;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lm5;

.field public h0:Z


# direct methods
.method public constructor <init>(Lm5;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Laq7;-><init>(Laq7;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcv6;->g0:Lm5;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcv6;->h0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcv6;->h0:Z

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Laq7;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-static {p0}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljo8;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcv6;->h0:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcv6;->h0:Z

    .line 10
    .line 11
    sget-object v0, Lmr6;->c:Lmr6;

    .line 12
    .line 13
    invoke-virtual {v0}, Lmr6;->a()Llr6;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, Lcv6;->g0:Lm5;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lm5;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Lka5; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p0}, Laq7;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    invoke-static {p0}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lja5;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :goto_0
    invoke-static {v0}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {p0}, Laq7;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 51
    .line 52
    .line 53
    new-instance p0, Lja5;

    .line 54
    .line 55
    new-instance v1, Lg01;

    .line 56
    .line 57
    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Lg01;-><init>(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    const-string p1, "Error occurred when trying to propagate error to Observer.onError"

    .line 69
    .line 70
    invoke-direct {p0, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :catchall_2
    move-exception p0

    .line 75
    invoke-static {p0}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lja5;

    .line 79
    .line 80
    new-instance v2, Lg01;

    .line 81
    .line 82
    filled-new-array {p1, v0, p0}, [Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {v2, p0}, Lg01;-><init>(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    const-string p0, "Error occurred when trying to propagate error to Observer.onError and during unsubscription."

    .line 94
    .line 95
    invoke-direct {v1, p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Laq7;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :catchall_3
    move-exception p0

    .line 104
    invoke-static {p0}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lka5;

    .line 108
    .line 109
    new-instance v1, Lg01;

    .line 110
    .line 111
    filled-new-array {p1, p0}, [Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-direct {v1, p0}, Lg01;-><init>(Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    const-string p0, "Observer.onError not implemented and error while unsubscribing."

    .line 123
    .line 124
    invoke-direct {v0, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_0
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcv6;->h0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcv6;->g0:Lm5;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lm5;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void

    .line 14
    :goto_0
    invoke-static {p1, p0}, Lvr3;->d0(Ljava/lang/Throwable;Lu85;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
