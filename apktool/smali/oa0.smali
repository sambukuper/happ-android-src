.class public final Loa0;
.super Luf5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltf5;


# instance fields
.field public final k0:Ls50;

.field public final l0:Lx15;

.field public final m0:Lz47;

.field public n0:Laz5;

.field public o0:Lhm1;


# direct methods
.method public constructor <init>(Lfk2;Lve4;Lvx4;Laz5;Lka0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p3, p1}, Luf5;-><init>(Lvx4;Lfk2;)V

    .line 11
    .line 12
    .line 13
    iput-object p5, p0, Loa0;->k0:Ls50;

    .line 14
    .line 15
    new-instance p1, Lx15;

    .line 16
    .line 17
    iget-object p2, p4, Laz5;->f0:Liz5;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object p3, p4, Laz5;->g0:Lgz5;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2, p3}, Lx15;-><init>(Liz5;Lgz5;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Loa0;->l0:Lx15;

    .line 31
    .line 32
    new-instance p2, Lz47;

    .line 33
    .line 34
    new-instance p3, Lve7;

    .line 35
    .line 36
    const/16 v0, 0xd

    .line 37
    .line 38
    invoke-direct {p3, p0, v0}, Lve7;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, p4, p1, p5, p3}, Lz47;-><init>(Laz5;Lx15;Ls50;Lve7;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Loa0;->m0:Lz47;

    .line 45
    .line 46
    iput-object p4, p0, Loa0;->n0:Laz5;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final I0(Lhl1;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Loa0;->n0:Laz5;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Loa0;->n0:Laz5;

    .line 10
    .line 11
    new-instance v2, Lhm1;

    .line 12
    .line 13
    iget-object v4, v0, Laz5;->h0:Lzy5;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "scope of "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    new-instance v10, Lf3;

    .line 33
    .line 34
    const/16 v0, 0x13

    .line 35
    .line 36
    invoke-direct {v10, p0, v0}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    iget-object v5, p0, Loa0;->l0:Lx15;

    .line 40
    .line 41
    iget-object v6, p0, Loa0;->k0:Ls50;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v3, p0

    .line 45
    move-object v8, p1

    .line 46
    invoke-direct/range {v2 .. v10}, Lhm1;-><init>(Ltf5;Lzy5;Lw15;Ls50;Lst3;Lhl1;Ljava/lang/String;Ldn2;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, v3, Loa0;->o0:Lhm1;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    const-string p0, "Repeated call to DeserializedPackageFragmentImpl::initialize"

    .line 53
    .line 54
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final K()Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Loa0;->o0:Lhm1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "_memberScope"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "builtins package fragment for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Luf5;->i0:Lfk2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " from "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget v1, Lel1;->a:I

    .line 19
    .line 20
    invoke-static {p0}, Lbl1;->c(Led1;)Lvx4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
