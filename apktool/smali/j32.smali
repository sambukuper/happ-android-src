.class public final Lj32;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfx5;


# instance fields
.field public final synthetic X:Lgx5;


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lu32;->a:Lu32;

    .line 5
    .line 6
    sget-object v1, Lu32;->c:Le32;

    .line 7
    .line 8
    sget-object v3, Lgl1;->e:Lfl1;

    .line 9
    .line 10
    const-string v0, "<Error property>"

    .line 11
    .line 12
    invoke-static {v0}, Lv15;->g(Ljava/lang/String;)Lv15;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    const/4 v6, 0x1

    .line 17
    sget-object v7, Lke7;->G:Lg55;

    .line 18
    .line 19
    sget-object v2, Lfx4;->f0:Lfx4;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-static/range {v1 .. v7}, Lgx5;->I0(Led1;Lfx4;Lfl1;ZLv15;ILke7;)Lgx5;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    sget-object v9, Lu32;->e:Lq32;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    sget-object v10, Ld02;->X:Ld02;

    .line 31
    .line 32
    move-object v13, v10

    .line 33
    invoke-virtual/range {v8 .. v13}, Lgx5;->O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    iput-object v8, p0, Lj32;->X:Lgx5;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->t0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final E()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->v0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final H()Ls21;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->H()Ls21;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final I(Led1;Lfx4;Lfl1;)Lld0;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lgx5;->H0(Led1;Lfx4;Lfl1;)Lgx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, Lid1;->n(Lgx5;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final L()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqt8;->L()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final P()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->x0:Li44;

    .line 4
    .line 5
    return-object p0
.end method

.method public final R()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->j0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final S()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->y0:Li44;

    .line 4
    .line 5
    return-object p0
.end method

.method public final T()Ly82;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->D0:Ly82;

    .line 4
    .line 5
    return-object p0
.end method

.method public final V()Ly82;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->C0:Ly82;

    .line 4
    .line 5
    return-object p0
.end method

.method public final Y()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->Y()Ljava/util/List;

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

.method public final Z()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->r0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final bridge synthetic a()Led1;
    .locals 0

    .line 13
    invoke-virtual {p0}, Lj32;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final a()Lfx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

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

.method public final bridge synthetic a()Ljd0;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lj32;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic a()Lld0;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lj32;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final b()Lhx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->A0:Lhx5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final c()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqt8;->c()Lt14;

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

.method public final d()Ltx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-object p0, p0, Lgx5;->B0:Ltx5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->e()Lfl1;

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

.method public final e0(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iput-object p1, p0, Lgx5;->o0:Ljava/util/Collection;

    .line 4
    .line 5
    return-void
.end method

.method public final g(Lwi8;)Lfx5;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lgx5;->g(Lwi8;)Lfx5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final bridge synthetic g(Lwi8;)Lgd1;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lj32;->g(Lwi8;)Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcw0;->getAnnotations()Lsm;

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

.method public final getName()Lv15;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

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

.method public final getSource()Lke7;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhd1;->getSource()Lke7;

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

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final j()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->j()Lt14;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final j0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->u0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->m()Lfx4;

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

.method public final p()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhd1;->p()Led1;

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

.method public final q()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->q()Ljava/util/Collection;

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

.method public final r()I
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->r()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method public final u()Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgx5;->u()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final v(Lyl1;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final w()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj32;->X:Lgx5;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgx5;->s0:Z

    .line 4
    .line 5
    return p0
.end method

.method public final z()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
