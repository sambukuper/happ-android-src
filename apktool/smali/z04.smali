.class public final Lz04;
.super Lob6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Lm04;

.field public final Y:Lqz3;

.field public final Z:I

.field public final f0:Lfw3;

.field public final g0:Ljava/lang/String;

.field public final h0:Lg44;


# direct methods
.method public constructor <init>(Lm04;Lqz3;ILfw3;Lli8;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lob6;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lz04;->X:Lm04;

    .line 11
    .line 12
    iput-object p2, p0, Lz04;->Y:Lqz3;

    .line 13
    .line 14
    iput p3, p0, Lz04;->Z:I

    .line 15
    .line 16
    iput-object p4, p0, Lz04;->f0:Lfw3;

    .line 17
    .line 18
    iget-object p1, p2, Lqz3;->b:Ljava/lang/String;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const-string p3, "<"

    .line 22
    .line 23
    invoke-static {p1, p2, p3}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    iput-object p1, p0, Lz04;->g0:Ljava/lang/String;

    .line 32
    .line 33
    new-instance p1, Lc3;

    .line 34
    .line 35
    const/16 p2, 0x18

    .line 36
    .line 37
    invoke-direct {p1, p0, p5, p2}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    sget-object p2, Lw74;->X:Lw74;

    .line 41
    .line 42
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lz04;->h0:Lg44;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lz04;->h0:Lg44;

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

.method public final F()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz04;->X:Lm04;

    .line 2
    .line 3
    instance-of v1, v0, Ll14;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Lkb6;->D()Lov3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, Lew3;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Lmb6;->L(Lkb6;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Only constructors and top-level callables are supported for now: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lkb6;->D()Lov3;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lxu3;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object p0, p0, Lz04;->g0:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v0, p0}, Lxw3;->p(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_1
    :goto_0
    sget-object v0, Low;->a:[Lnw3;

    .line 48
    .line 49
    iget-object p0, p0, Lz04;->Y:Lqz3;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v0, Low;->C:Ldq;

    .line 55
    .line 56
    sget-object v1, Low;->a:[Lnw3;

    .line 57
    .line 58
    const/16 v2, 0x38

    .line 59
    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method

.method public final G()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lz04;->Y:Lqz3;

    .line 2
    .line 3
    iget-object p0, p0, Lqz3;->d:Lmz3;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final f()Lkb6;
    .locals 0

    .line 1
    iget-object p0, p0, Lz04;->X:Lm04;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lz04;->g0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Lz04;->Y:Lqz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->C:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x38

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final v()I
    .locals 0

    .line 1
    iget p0, p0, Lz04;->Z:I

    .line 2
    .line 3
    return p0
.end method

.method public final x()Lfw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lz04;->f0:Lfw3;

    .line 2
    .line 3
    return-object p0
.end method
