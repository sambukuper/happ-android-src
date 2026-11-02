.class public final Lwx4;
.super Lfd1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvx4;


# instance fields
.field public final g0:Lve4;

.field public final h0:Lzz3;

.field public final i0:Ljava/util/Map;

.field public final j0:Lcg5;

.field public k0:Lux4;

.field public l0:Lwf5;

.field public final m0:Z

.field public final n0:Lpe4;

.field public final o0:Lvz7;


# direct methods
.method public constructor <init>(Lv15;Lve4;Lzz3;I)V
    .locals 0

    .line 1
    sget-object p4, Loy1;->f0:Lrm;

    .line 2
    .line 3
    invoke-direct {p0, p4, p1}, Lfd1;-><init>(Lsm;Lv15;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lwx4;->g0:Lve4;

    .line 7
    .line 8
    iput-object p3, p0, Lwx4;->h0:Lzz3;

    .line 9
    .line 10
    iget-boolean p3, p1, Lv15;->Y:Z

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    sget-object p1, Le02;->X:Le02;

    .line 15
    .line 16
    iput-object p1, p0, Lwx4;->i0:Ljava/util/Map;

    .line 17
    .line 18
    sget-object p1, Lcg5;->a:Llh4;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object p1, Llh4;->u0:Ljh0;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lwx4;->W(Ljh0;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcg5;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    sget-object p1, Lbg5;->b:Lbg5;

    .line 34
    .line 35
    :cond_0
    iput-object p1, p0, Lwx4;->j0:Lcg5;

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lwx4;->m0:Z

    .line 39
    .line 40
    new-instance p3, Lf0;

    .line 41
    .line 42
    const/16 p4, 0x18

    .line 43
    .line 44
    invoke-direct {p3, p0, p4}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p3}, Lve4;->b(Lgn2;)Lpe4;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lwx4;->n0:Lpe4;

    .line 52
    .line 53
    new-instance p2, Lps3;

    .line 54
    .line 55
    invoke-direct {p2, p0, p1}, Lps3;-><init>(Lwx4;B)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Lvz7;

    .line 59
    .line 60
    invoke-direct {p1, p2}, Lvz7;-><init>(Ldn2;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lwx4;->o0:Lvz7;

    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    const-string p0, "Module name must be special: "

    .line 67
    .line 68
    invoke-static {p1, p0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0
.end method


# virtual methods
.method public final A(Lvx4;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eq p0, p1, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lwx4;->k0:Lux4;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lm02;->X:Lm02;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lwx4;->a0()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Lvx4;->a0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final G0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwx4;->m0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lph3;->a:Ljh0;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lwx4;->W(Ljh0;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, Loh3;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Accessing invalid module descriptor "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lid1;->l(Lwx4;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final W(Ljh0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lwx4;->i0:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    return-object p0
.end method

.method public final a0()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lwx4;->k0:Lux4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ld02;->X:Ld02;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, Lv15;->X:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, " were not set"

    .line 18
    .line 19
    const-string v1, "Dependencies of module "

    .line 20
    .line 21
    invoke-static {v1, p0, v0}, Lxw3;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final b0(Lfk2;)Ln74;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwx4;->G0()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lwx4;->n0:Lpe4;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ln74;

    .line 14
    .line 15
    return-object p0
.end method

.method public final f()Lzz3;
    .locals 0

    .line 1
    iget-object p0, p0, Lwx4;->h0:Lzz3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final t(Lfk2;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwx4;->G0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lwx4;->G0()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwx4;->o0:Lvz7;

    .line 11
    .line 12
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lj01;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lj01;->t(Lfk2;Lgn2;)Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {p0}, Lfd1;->F0(Led1;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, p0, Lwx4;->m0:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, " !isValid"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v1, " packageFragmentProvider: "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lwx4;->l0:Lwf5;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
