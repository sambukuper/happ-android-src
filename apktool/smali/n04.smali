.class public final Ln04;
.super Lp04;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final k0:Lcz3;

.field public final l0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lcz3;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lyu3;->k:Lyu3;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3, v0}, Lp04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lyu3;)V

    .line 13
    .line 14
    .line 15
    iput-object p4, p0, Ln04;->k0:Lcz3;

    .line 16
    .line 17
    new-instance p2, Lok3;

    .line 18
    .line 19
    const/4 p3, 0x2

    .line 20
    invoke-direct {p2, p1, p3}, Lok3;-><init>(Lov3;B)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lw74;->X:Lw74;

    .line 24
    .line 25
    invoke-static {p1, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ln04;->l0:Lg44;

    .line 30
    .line 31
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
    sget-object v0, Lyu3;->k:Lyu3;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lyu3;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Ln04;

    .line 16
    .line 17
    sget-object v0, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p0, Ln04;->k0:Lcz3;

    .line 20
    .line 21
    iget-object p0, p0, Lp04;->Z:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {p2, p1, p0, v0, v1}, Ln04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lcz3;)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    const-string p1, "Constructors cannot have fake overrides: "

    .line 28
    .line 29
    invoke-static {p0, p1}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final X()Lpt3;
    .locals 1

    .line 1
    iget-object v0, p0, Ln04;->k0:Lcz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lch3;->D(Lcz3;)Lat3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lat3;->a:Lpt3;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "No signature for constructor: "

    .line 16
    .line 17
    invoke-static {p0, v0}, Lxw3;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final Z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ln04;->k0:Lcz3;

    .line 2
    .line 3
    iget-object p0, p0, Lcz3;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object p0
.end method

.method public final e()Lzw3;
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ln04;->k0:Lcz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->g:Lz47;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x11

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lz47;->J(Lnw3;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lgz8;

    .line 21
    .line 22
    invoke-static {p0}, Lys0;->c0(Lgz8;)Lzw3;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<init>"

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Ln04;->l0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpw3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()Lex4;
    .locals 0

    .line 1
    sget-object p0, Lex4;->Y:Lex4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
