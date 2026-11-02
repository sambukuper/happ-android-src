.class public final Lew3;
.super Lov3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic f0:I


# instance fields
.field public final Y:Ljava/lang/Class;

.field public final Z:Lg44;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lew3;->Y:Ljava/lang/Class;

    .line 5
    .line 6
    new-instance p1, Lbw3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lbw3;-><init>(Lew3;B)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lw74;->X:Lw74;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lew3;->Z:Lg44;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final V()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final W()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final X(Lv15;)Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw3;

    .line 8
    .line 9
    iget-object p0, p0, Ldw3;->e:Ltb6;

    .line 10
    .line 11
    sget-object v0, Ldw3;->g:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Let4;

    .line 24
    .line 25
    sget-object v0, Lx45;->Y:Lx45;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final Y(I)Lfx5;
    .locals 10

    .line 1
    iget-object v0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldw3;

    .line 8
    .line 9
    iget-object v0, v0, Ldw3;->e:Ltb6;

    .line 10
    .line 11
    sget-object v1, Ldw3;->g:[Lnw3;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v0, Let4;

    .line 24
    .line 25
    instance-of v1, v0, Lhm1;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    check-cast v0, Lhm1;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v2

    .line 34
    :goto_0
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v1, v0, Lgm1;->b:Ljl1;

    .line 38
    .line 39
    iget-object v0, v0, Lhm1;->h:Lzy5;

    .line 40
    .line 41
    sget-object v3, Llu3;->l:Laq2;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v3, p1}, Lch3;->z(Lyp2;Laq2;I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    move-object v5, p1

    .line 51
    check-cast v5, Lcz5;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    new-instance v4, Lqd4;

    .line 56
    .line 57
    invoke-direct {v4, p0}, Lqd4;-><init>(Lov3;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v1, Ljl1;->Y:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v6, p1

    .line 63
    check-cast v6, Lw15;

    .line 64
    .line 65
    new-instance v7, Lux4;

    .line 66
    .line 67
    iget-object p1, v0, Lzy5;->i0:Ltz5;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-direct {v7, p1}, Lux4;-><init>(Ltz5;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v1, Ljl1;->h0:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v8, p1

    .line 78
    check-cast v8, Ls50;

    .line 79
    .line 80
    sget-object v9, Lg0;->m0:Lg0;

    .line 81
    .line 82
    iget-object v3, p0, Lew3;->Y:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-static/range {v3 .. v9}, Lms8;->g(Ljava/lang/Class;Lxl1;Lyp2;Lw15;Lux4;Ls50;Lrn2;)Ljd0;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Lfx5;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_2
    :goto_1
    return-object v2
.end method

.method public final Z(I)Lkz3;
    .locals 1

    .line 1
    iget-object p0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw3;

    .line 8
    .line 9
    iget-object p0, p0, Ldw3;->c:Lg44;

    .line 10
    .line 11
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0}, Lwv0;->Q0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljz3;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lrt3;->b:Lgz3;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ljz3;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {p0, v0}, Ljb5;->N(Ljava/util/Collection;Lgz3;)Lfz3;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lrt3;

    .line 37
    .line 38
    iget-object p0, p0, Lrt3;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {p1, p0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lkz3;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public final a0()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldw3;

    .line 8
    .line 9
    iget-object v0, v0, Ldw3;->f:Lg44;

    .line 10
    .line 11
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    return-object v0
.end method

.method public final b0(Lv15;)Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw3;

    .line 8
    .line 9
    iget-object p0, p0, Ldw3;->e:Ltb6;

    .line 10
    .line 11
    sget-object v0, Ldw3;->g:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Let4;

    .line 24
    .line 25
    sget-object v0, Lx45;->Y:Lx45;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final e0()Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object p0, p0, Lew3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw3;

    .line 8
    .line 9
    iget-object p0, p0, Ldw3;->c:Lg44;

    .line 10
    .line 11
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljz3;

    .line 37
    .line 38
    iget-object v1, v1, Ljz3;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lew3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lew3;

    .line 6
    .line 7
    iget-object p1, p1, Lew3;->Y:Ljava/lang/Class;

    .line 8
    .line 9
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final t()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "file class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {p0}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
