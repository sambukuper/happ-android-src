.class public final Lc45;
.super Laa7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfo0;


# instance fields
.field public final Y:Lun0;

.field public final Z:Ld45;

.field public final f0:Lmo8;

.field public final g0:Lch8;

.field public final h0:Z

.field public final i0:Z


# direct methods
.method public constructor <init>(Lun0;Ld45;Lmo8;Lch8;ZI)V
    .locals 7

    .line 1
    and-int/lit8 v0, p6, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p4, Lch8;->Y:Lxd6;

    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p4, Lch8;->Z:Lch8;

    .line 11
    .line 12
    :cond_0
    move-object v4, p4

    .line 13
    and-int/lit8 p4, p6, 0x10

    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    const/4 p5, 0x0

    .line 18
    :cond_1
    move v5, p5

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v3, p3

    .line 24
    invoke-direct/range {v0 .. v6}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZZ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lun0;Ld45;Lmo8;Lch8;ZZ)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lc45;->Y:Lun0;

    .line 30
    iput-object p2, p0, Lc45;->Z:Ld45;

    .line 31
    iput-object p3, p0, Lc45;->f0:Lmo8;

    .line 32
    iput-object p4, p0, Lc45;->g0:Lch8;

    .line 33
    iput-boolean p5, p0, Lc45;->h0:Z

    .line 34
    iput-boolean p6, p0, Lc45;->i0:Z

    return-void
.end method


# virtual methods
.method public final K()Let4;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Ljava/lang/String;

    .line 3
    .line 4
    sget-object v0, Lo32;->Y:Lo32;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v0, v1, p0}, Lu32;->a(Lo32;Z[Ljava/lang/String;)Ln32;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final l0()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()Lch8;
    .locals 0

    .line 1
    iget-object p0, p0, Lc45;->g0:Lch8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n0()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lc45;->Z:Ld45;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lc45;->h0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic p0(Lz14;)Lt14;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc45;->w0(Lz14;)Lc45;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final r0(Z)Lmo8;
    .locals 7

    .line 1
    new-instance v0, Lc45;

    .line 2
    .line 3
    iget-object v4, p0, Lc45;->g0:Lch8;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget-object v1, p0, Lc45;->Y:Lun0;

    .line 8
    .line 9
    iget-object v2, p0, Lc45;->Z:Ld45;

    .line 10
    .line 11
    iget-object v3, p0, Lc45;->f0:Lmo8;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final bridge synthetic s0(Lz14;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc45;->w0(Lz14;)Lc45;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic t0(Lch8;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc45;->v0(Lch8;)Laa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u0(Z)Laa7;
    .locals 7

    .line 1
    new-instance v0, Lc45;

    .line 2
    .line 3
    iget-object v4, p0, Lc45;->g0:Lch8;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget-object v1, p0, Lc45;->Y:Lun0;

    .line 8
    .line 9
    iget-object v2, p0, Lc45;->Z:Ld45;

    .line 10
    .line 11
    iget-object v3, p0, Lc45;->f0:Lmo8;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final v0(Lch8;)Laa7;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lc45;

    .line 5
    .line 6
    iget-boolean v5, p0, Lc45;->h0:Z

    .line 7
    .line 8
    iget-boolean v6, p0, Lc45;->i0:Z

    .line 9
    .line 10
    iget-object v1, p0, Lc45;->Y:Lun0;

    .line 11
    .line 12
    iget-object v2, p0, Lc45;->Z:Ld45;

    .line 13
    .line 14
    iget-object v3, p0, Lc45;->f0:Lmo8;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    invoke-direct/range {v0 .. v6}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZZ)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final w0(Lz14;)Lc45;
    .locals 11

    .line 1
    iget-object v0, p0, Lc45;->Z:Ld45;

    .line 2
    .line 3
    iget-object v1, v0, Ld45;->X:Lni8;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lni8;->d(Lz14;)Lni8;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Ld45;->Y:Ldn2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lc3;

    .line 15
    .line 16
    const/16 v4, 0x1b

    .line 17
    .line 18
    invoke-direct {v2, v0, p1, v4}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v3

    .line 23
    :goto_0
    iget-object p1, v0, Ld45;->Z:Ld45;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    move-object p1, v0

    .line 28
    :cond_1
    iget-object v0, v0, Ld45;->f0:Lhi8;

    .line 29
    .line 30
    new-instance v6, Ld45;

    .line 31
    .line 32
    invoke-direct {v6, v1, v2, p1, v0}, Ld45;-><init>(Lni8;Ldn2;Ld45;Lhi8;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lc45;->f0:Lmo8;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    move-object v7, p1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v7, v3

    .line 42
    :goto_1
    new-instance v4, Lc45;

    .line 43
    .line 44
    iget-object v5, p0, Lc45;->Y:Lun0;

    .line 45
    .line 46
    iget-object v8, p0, Lc45;->g0:Lch8;

    .line 47
    .line 48
    iget-boolean v9, p0, Lc45;->h0:Z

    .line 49
    .line 50
    const/16 v10, 0x20

    .line 51
    .line 52
    invoke-direct/range {v4 .. v10}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZI)V

    .line 53
    .line 54
    .line 55
    return-object v4
.end method
