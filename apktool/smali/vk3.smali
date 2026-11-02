.class public final Lvk3;
.super Lqk3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final i0:Lg44;

.field public final j0:Lg44;

.field public final k0:Lg44;

.field public final l0:Lg44;

.field public final m0:Lg44;

.field public final n0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Ljava/lang/reflect/Method;Ljava/lang/Object;Lyu3;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lqk3;-><init>(Lov3;Ljava/lang/reflect/Member;Ljava/lang/Object;Lyu3;)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Ltk3;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-direct {p2, p0, p3}, Ltk3;-><init>(Lvk3;B)V

    .line 14
    .line 15
    .line 16
    sget-object p3, Lw74;->X:Lw74;

    .line 17
    .line 18
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iput-object p2, p0, Lvk3;->i0:Lg44;

    .line 23
    .line 24
    new-instance p2, Lc3;

    .line 25
    .line 26
    const/16 v0, 0x12

    .line 27
    .line 28
    invoke-direct {p2, p4, p0, v0}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Lvk3;->j0:Lg44;

    .line 36
    .line 37
    new-instance p2, Lem1;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p2, p0, p1, p4, v0}, Lem1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lvk3;->k0:Lg44;

    .line 48
    .line 49
    new-instance v1, Lub;

    .line 50
    .line 51
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v7, 0x1

    .line 56
    const/16 v8, 0xf

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const-class v4, Lw51;

    .line 60
    .line 61
    const-string v5, "isJavaMethodAnOperator"

    .line 62
    .line 63
    const-string v6, "isJavaMethodAnOperator(Ljava/lang/reflect/Method;)Z"

    .line 64
    .line 65
    invoke-direct/range {v1 .. v8}, Lub;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    invoke-static {p3, v1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lvk3;->l0:Lg44;

    .line 73
    .line 74
    new-instance p1, Ltk3;

    .line 75
    .line 76
    invoke-direct {p1, p0, v0}, Ltk3;-><init>(Lvk3;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p3, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lvk3;->m0:Lg44;

    .line 84
    .line 85
    new-instance p1, Ltk3;

    .line 86
    .line 87
    const/4 p2, 0x2

    .line 88
    invoke-direct {p1, p0, p2}, Ltk3;-><init>(Lvk3;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p3, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 92
    .line 93
    .line 94
    new-instance p1, Ltk3;

    .line 95
    .line 96
    const/4 p2, 0x3

    .line 97
    invoke-direct {p1, p0, p2}, Ltk3;-><init>(Lvk3;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p3, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lvk3;->n0:Lg44;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final A(Lov3;Lyu3;)Lkb6;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lvk3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v1, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, v1, p2}, Lvk3;-><init>(Lov3;Ljava/lang/reflect/Method;Ljava/lang/Object;Lyu3;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final T()[Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final U()[Ljava/lang/reflect/TypeVariable;
    .locals 0

    .line 1
    iget-object p0, p0, Lvk3;->m0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, [Ljava/lang/reflect/TypeVariable;

    .line 11
    .line 12
    return-object p0
.end method

.method public final V()[Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final W()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->isVarArgs()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final X()Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    iget-object p0, p0, Lmk3;->Z:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/reflect/Method;

    .line 7
    .line 8
    return-object p0
.end method

.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lkm4;->M(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lmk3;->Z:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final j()Lpw3;
    .locals 1

    .line 1
    iget-object v0, p0, Lvk3;->k0:Lg44;

    .line 2
    .line 3
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Luk3;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Luk3;->b:Lu1;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lvk3;->j0:Lg44;

    .line 15
    .line 16
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lu1;

    .line 21
    .line 22
    return-object p0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lvk3;->k0:Lg44;

    .line 2
    .line 3
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Luk3;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Luk3;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lvk3;->i0:Lg44;

    .line 15
    .line 16
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    return-object p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvk3;->l0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final r()Lwd0;
    .locals 0

    .line 1
    iget-object p0, p0, Lvk3;->n0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwd0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final y()Lwd0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
