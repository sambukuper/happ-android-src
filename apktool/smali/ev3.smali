.class public final Lev3;
.super Lov3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh04;
.implements Lzu3;
.implements Lsw3;
.implements Lmh8;


# static fields
.field public static final f0:Ljava/util/HashSet;


# instance fields
.field public final Y:Ljava/lang/Class;

.field public final Z:Lg44;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lgf7;->a:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lqs0;

    .line 23
    .line 24
    invoke-virtual {v2}, Lqs0;->a()Lfk2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v2, v2, Lfk2;->a:Lgk2;

    .line 29
    .line 30
    invoke-virtual {v2}, Lgk2;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sput-object v1, Lev3;->f0:Ljava/util/HashSet;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lev3;->Y:Ljava/lang/Class;

    .line 5
    .line 6
    new-instance p1, Lav3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lav3;-><init>(Lev3;B)V

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
    iput-object p1, p0, Lev3;->Z:Lg44;

    .line 19
    .line 20
    return-void
.end method

.method public static e0(Lqs0;Lgr6;)Lms0;
    .locals 7

    .line 1
    new-instance v0, Lms0;

    .line 2
    .line 3
    new-instance v1, Lh02;

    .line 4
    .line 5
    iget-object p1, p1, Lgr6;->a:Lhl1;

    .line 6
    .line 7
    iget-object v2, p1, Lhl1;->b:Lvx4;

    .line 8
    .line 9
    iget-object v3, p0, Lqs0;->a:Lfk2;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lh02;-><init>(Lvx4;Lfk2;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lqs0;->f()Lv15;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p0, p1, Lhl1;->b:Lvx4;

    .line 20
    .line 21
    invoke-interface {p0}, Lvx4;->f()Lzz3;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v3, "Any"

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Lzz3;->k(Ljava/lang/String;)Lsx4;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lsx4;->X()Laa7;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-object v6, p1, Lhl1;->a:Lve4;

    .line 40
    .line 41
    sget-object v3, Lfx4;->Y:Lfx4;

    .line 42
    .line 43
    sget-object v4, Lus0;->X:Lus0;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v6}, Lms0;-><init>(Led1;Lv15;Lfx4;Lus0;Ljava/util/Collection;Lve4;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lfo2;

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-direct {p0, v6, v0, p1}, Lfo2;-><init>(Lve4;Lm0;B)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lm02;->X:Lm02;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0, p0, p1, v1}, Lms0;->B0(Let4;Ljava/util/Set;Lgs0;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method


# virtual methods
.method public final C()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Low;->f:Ldq;

    .line 8
    .line 9
    sget-object v1, Low;->a:[Lnw3;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final E()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->f:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x2

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
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
.end method

.method public final I()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lev3;->j0()Lex4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lex4;->g0:Lex4;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final O(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, Lia6;->d:Ljava/util/Map;

    .line 2
    .line 3
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0, p1}, Lci8;->B(ILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-static {p0}, Lia6;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object p0, v0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final P()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->o:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/util/Collection;

    .line 25
    .line 26
    return-object p0
.end method

.method public final Q()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->e:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

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
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
.end method

.method public final V()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lsx4;->B()Ljava/util/Collection;

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

.method public final W()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lyy3;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    sget-object p0, Ld02;->X:Ld02;

    .line 14
    .line 15
    :cond_1
    return-object p0
.end method

.method public final X(Lv15;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lsx4;->X()Laa7;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lt14;->K()Let4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lx45;->Y:Lx45;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lsx4;->o0()Let4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final Y(I)Lfx5;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lvl1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lvl1;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, Lvl1;->g0:Lfy5;

    .line 17
    .line 18
    sget-object v3, Llu3;->h:Laq2;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3, p1}, Lch3;->z(Lyp2;Laq2;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, Lcz5;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    new-instance v4, Lqd4;

    .line 33
    .line 34
    invoke-direct {v4, p0}, Lqd4;-><init>(Lov3;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, Lvl1;->n0:Ljl1;

    .line 38
    .line 39
    iget-object v1, p1, Ljl1;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    check-cast v6, Lw15;

    .line 43
    .line 44
    iget-object p1, p1, Ljl1;->f0:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, Lux4;

    .line 48
    .line 49
    iget-object v8, v0, Lvl1;->h0:Ls50;

    .line 50
    .line 51
    sget-object v9, Lg0;->l0:Lg0;

    .line 52
    .line 53
    iget-object v3, p0, Lev3;->Y:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static/range {v3 .. v9}, Lms8;->g(Ljava/lang/Class;Lxl1;Lyp2;Lw15;Lux4;Ls50;Lrn2;)Ljd0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lfx5;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    return-object v2
.end method

.method public final Z(I)Lkz3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lch3;->C(Lyy3;)Lys3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, Lys3;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p1, p0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lkz3;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final b0(Lv15;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lsx4;->X()Laa7;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lt14;->K()Let4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lx45;->Y:Lx45;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lsx4;->o0()Let4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final c()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->k:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/util/List;

    .line 25
    .line 26
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lev3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lzc1;->N(Lzu3;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lzu3;

    .line 10
    .line 11
    invoke-static {p1}, Lzc1;->N(Lzu3;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final f0()Lqs0;
    .locals 2

    .line 1
    sget-object v0, Lir6;->a:Lqs0;

    .line 2
    .line 3
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lut3;->b(Ljava/lang/String;)Lut3;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lut3;->c()Ldu5;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_0
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance p0, Lqs0;

    .line 40
    .line 41
    sget-object v0, Lug7;->k:Lfk2;

    .line 42
    .line 43
    iget-object v1, v1, Ldu5;->Y:Lv15;

    .line 44
    .line 45
    invoke-direct {p0, v0, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    sget-object p0, Ltg7;->g:Lgk2;

    .line 50
    .line 51
    invoke-virtual {p0}, Lgk2;->i()Lfk2;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v0, Lqs0;

    .line 56
    .line 57
    invoke-virtual {p0}, Lfk2;->b()Lfk2;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 62
    .line 63
    invoke-virtual {p0}, Lgk2;->g()Lv15;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v0, v1, p0}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    sget-object p0, Lir6;->a:Lqs0;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lut3;->b(Ljava/lang/String;)Lut3;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lut3;->c()Ldu5;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_4
    if-eqz v1, :cond_5

    .line 101
    .line 102
    new-instance p0, Lqs0;

    .line 103
    .line 104
    sget-object v0, Lug7;->k:Lfk2;

    .line 105
    .line 106
    iget-object v1, v1, Ldu5;->X:Lv15;

    .line 107
    .line 108
    invoke-direct {p0, v0, v1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_5
    invoke-static {p0}, Lia6;->a(Ljava/lang/Class;)Lqs0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-boolean v0, p0, Lqs0;->c:Z

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    sget-object v0, Lll3;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lll3;->g(Lfk2;)Lqs0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_6
    return-object p0
.end method

.method public final g0()Lts0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Low;->a(Lyy3;)Lts0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object p0, Lts0;->h0:Lts0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    sget-object p0, Lts0;->Z:Lts0;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    sget-object p0, Lts0;->f0:Lts0;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_5

    .line 53
    .line 54
    sget-object p0, Lts0;->g0:Lts0;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    sget-object p0, Lts0;->Y:Lts0;

    .line 58
    .line 59
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->i:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x6

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
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
.end method

.method public final h0()Lsx4;
    .locals 0

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcv3;->b()Lsx4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lzc1;->N(Lzu3;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i0()Lyy3;
    .locals 0

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcv3;->c()Lyy3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final j0()Lex4;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v1, Low;->b:Lz47;

    .line 8
    .line 9
    sget-object v2, Low;->a:[Lnw3;

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    aget-object v2, v2, v3

    .line 13
    .line 14
    invoke-virtual {v1, v2, v0}, Lz47;->J(Lnw3;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lex4;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_6

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p0}, Lz68;->r0(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    sget-object p0, Lex4;->g0:Lex4;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    sget-object p0, Lex4;->f0:Lex4;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    sget-object p0, Lex4;->Z:Lex4;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    sget-object p0, Lex4;->Y:Lex4;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_6
    :goto_1
    sget-object p0, Lex4;->Y:Lex4;

    .line 84
    .line 85
    return-object p0
.end method

.method public final k0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->m:Lg44;

    .line 10
    .line 11
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final n()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    sget-object p0, Low;->e:Ldq;

    .line 30
    .line 31
    sget-object v1, Low;->a:[Lnw3;

    .line 32
    .line 33
    const/16 v2, 0xa

    .line 34
    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->g:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x3

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
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
.end method

.method public final t()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lev3;->f0()Lqs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lqs0;->a:Lfk2;

    .line 6
    .line 7
    iget-object v1, v0, Lfk2;->a:Lgk2;

    .line 8
    .line 9
    invoke-virtual {v1}, Lgk2;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x2e

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 26
    .line 27
    iget-object v0, v0, Lgk2;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Loi0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iget-object p0, p0, Lqs0;->b:Lfk2;

    .line 34
    .line 35
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 36
    .line 37
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v1, 0x24

    .line 40
    .line 41
    invoke-static {p0, v2, v1}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "class "

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final u()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcv3;

    .line 8
    .line 9
    iget-object p0, p0, Lcv3;->h:Ltb6;

    .line 10
    .line 11
    sget-object v0, Lcv3;->r:[Lnw3;

    .line 12
    .line 13
    const/4 v1, 0x4

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
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
.end method

.method public final v()Ljava/lang/reflect/GenericDeclaration;
    .locals 0

    .line 1
    iget-object p0, p0, Lev3;->Y:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
