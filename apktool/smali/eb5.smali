.class public final Leb5;
.super Lwb4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 98
    const/4 v0, 0x0

    iput-byte v0, p0, Leb5;->e:B

    invoke-direct {p0, p1}, Lwb4;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Leb5;->e:B

    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lwb4;-><init>(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwb4;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ll49;

    .line 13
    .line 14
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    const-wide/32 p3, 0xdbba0

    .line 19
    .line 20
    .line 21
    cmp-long v0, p1, p3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    invoke-static {}, Llh4;->P0()Llh4;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :cond_0
    if-gez v0, :cond_1

    .line 33
    .line 34
    move-wide v1, p3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-wide v1, p1

    .line 37
    :goto_0
    if-gez v0, :cond_2

    .line 38
    .line 39
    move-wide v3, p3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-wide v3, p1

    .line 42
    :goto_1
    cmp-long p1, v1, p3

    .line 43
    .line 44
    if-gez p1, :cond_3

    .line 45
    .line 46
    invoke-static {}, Llh4;->P0()Llh4;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :cond_3
    if-gez p1, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    move-wide p3, v1

    .line 57
    :goto_2
    iput-wide p3, p0, Ll49;->h:J

    .line 58
    .line 59
    const-wide/32 p1, 0x493e0

    .line 60
    .line 61
    .line 62
    cmp-long p1, v3, p1

    .line 63
    .line 64
    if-gez p1, :cond_5

    .line 65
    .line 66
    invoke-static {}, Llh4;->P0()Llh4;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :cond_5
    iget-wide p1, p0, Ll49;->h:J

    .line 74
    .line 75
    cmp-long p1, v3, p1

    .line 76
    .line 77
    if-lez p1, :cond_6

    .line 78
    .line 79
    invoke-static {}, Llh4;->P0()Llh4;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    :cond_6
    const-wide/32 v5, 0x493e0

    .line 87
    .line 88
    .line 89
    iget-wide v7, p0, Ll49;->h:J

    .line 90
    .line 91
    invoke-static/range {v3 .. v8}, Lx97;->p(JJJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    iput-wide p1, p0, Ll49;->i:J

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final b()Lg49;
    .locals 3

    .line 1
    iget-byte v0, p0, Leb5;->e:B

    .line 2
    .line 3
    iget-object v1, p0, Lwb4;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwb4;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ll49;

    .line 11
    .line 12
    iget-boolean v2, v0, Ll49;->q:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lfl5;

    .line 17
    .line 18
    iget-object p0, p0, Lwb4;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/UUID;

    .line 21
    .line 22
    check-cast v1, Ljava/util/Set;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0, v1}, Lg49;-><init>(Ljava/util/UUID;Ll49;Ljava/util/Set;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "PeriodicWorkRequests cannot be expedited"

    .line 29
    .line 30
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    return-object v2

    .line 35
    :pswitch_0
    new-instance v0, Lfb5;

    .line 36
    .line 37
    iget-object v2, p0, Lwb4;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/util/UUID;

    .line 40
    .line 41
    iget-object p0, p0, Lwb4;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ll49;

    .line 44
    .line 45
    check-cast v1, Ljava/util/Set;

    .line 46
    .line 47
    invoke-direct {v0, v2, p0, v1}, Lg49;-><init>(Ljava/util/UUID;Ll49;Ljava/util/Set;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
