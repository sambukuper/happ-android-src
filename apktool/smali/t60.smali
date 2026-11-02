.class public final Lt60;
.super Lkb8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# instance fields
.field public final synthetic f0:B

.field public final g0:Z


# direct methods
.method public constructor <init>(BZ)V
    .locals 1

    .line 1
    iput-byte p1, p0, Lt60;->f0:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-class p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    :goto_0
    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 15
    .line 16
    .line 17
    iput-boolean p2, p0, Lt60;->g0:Z

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    const-class p1, Ljava/net/InetAddress;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 24
    .line 25
    .line 26
    iput-boolean p2, p0, Lt60;->g0:Z

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    if-eqz p2, :cond_1

    .line 30
    .line 31
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-class p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    :goto_1
    const/4 v0, 0x2

    .line 37
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 38
    .line 39
    .line 40
    iput-boolean p2, p0, Lt60;->g0:Z

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lt37;Ld50;)Lar3;
    .locals 5

    .line 1
    iget-byte v0, p0, Lt60;->f0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Llj7;->X:Ljava/lang/Class;

    .line 5
    .line 6
    iget-boolean v3, p0, Lt60;->g0:Z

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2, v2}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p1, Lno3;->Y:Lmo3;

    .line 19
    .line 20
    invoke-virtual {p1}, Lmo3;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    sget-object p2, Lmo3;->i0:Lmo3;

    .line 27
    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v4

    .line 32
    :cond_1
    :goto_0
    if-eq v1, v3, :cond_2

    .line 33
    .line 34
    new-instance p0, Lt60;

    .line 35
    .line 36
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, p1, v1}, Lt60;-><init>(BZ)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-object p0

    .line 41
    :pswitch_0
    invoke-static {p1, p2, v2}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    iget-object p1, p1, Lno3;->Y:Lmo3;

    .line 48
    .line 49
    invoke-virtual {p1}, Lmo3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    new-instance p0, Lt60;

    .line 56
    .line 57
    invoke-direct {p0, v4, v3}, Lt60;-><init>(BZ)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    sget-object p2, Lmo3;->g0:Lmo3;

    .line 62
    .line 63
    if-ne p1, p2, :cond_4

    .line 64
    .line 65
    new-instance p0, Ls75;

    .line 66
    .line 67
    invoke-direct {p0, v4, v2}, Ls75;-><init>(ILjava/lang/Class;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_1
    return-object p0

    .line 71
    :pswitch_1
    const-class v0, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-static {p1, p2, v0}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object p1, p1, Lno3;->Y:Lmo3;

    .line 80
    .line 81
    invoke-virtual {p1}, Lmo3;->a()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    new-instance p0, Lt60;

    .line 88
    .line 89
    invoke-direct {p0, v1, v3}, Lt60;-><init>(BZ)V

    .line 90
    .line 91
    .line 92
    :cond_5
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 0

    .line 1
    iget-byte p3, p0, Lt60;->f0:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/net/InetAddress;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lt60;->r(Ljava/net/InetAddress;Lro3;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {p2, p0}, Lro3;->C(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    xor-int/lit8 p0, p0, 0x1

    .line 29
    .line 30
    invoke-virtual {p2, p0}, Lro3;->c0(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 1

    .line 1
    iget-byte p3, p0, Lt60;->f0:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/net/InetAddress;

    .line 7
    .line 8
    sget-object p3, Lgr3;->i0:Lgr3;

    .line 9
    .line 10
    invoke-virtual {p4, p1, p3}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const-class v0, Ljava/net/InetAddress;

    .line 15
    .line 16
    iput-object v0, p3, Lz76;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p4, p2, p3}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p0, p1, p2}, Lt60;->r(Ljava/net/InetAddress;Lro3;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4, p2, p3}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p2, p0}, Lro3;->C(Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p2, p0}, Lro3;->C(Z)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(Ljava/net/InetAddress;Lro3;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lt60;->g0:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 p1, 0x2f

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-ltz p1, :cond_2

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_2
    :goto_0
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
