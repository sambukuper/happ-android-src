.class public final Lnt8;
.super Lot8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final p0:Lvz7;


# direct methods
.method public constructor <init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lvz7;

    .line 5
    .line 6
    invoke-direct {p1, p12}, Lvz7;-><init>(Ldn2;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnt8;->p0:Lvz7;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final H0(Lko2;Lv15;I)Lot8;
    .locals 13

    .line 1
    new-instance v0, Lnt8;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcw0;->getAnnotations()Lsm;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lqt8;->c()Lt14;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lot8;->I0()Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    new-instance v12, Lzk3;

    .line 22
    .line 23
    const/16 v1, 0x1b

    .line 24
    .line 25
    invoke-direct {v12, p0, v1}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iget-boolean v8, p0, Lot8;->l0:Z

    .line 30
    .line 31
    iget-boolean v9, p0, Lot8;->m0:Z

    .line 32
    .line 33
    iget-object v10, p0, Lot8;->n0:Lt14;

    .line 34
    .line 35
    sget-object v11, Lke7;->G:Lg55;

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    move-object v5, p2

    .line 39
    move/from16 v3, p3

    .line 40
    .line 41
    invoke-direct/range {v0 .. v12}, Lnt8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;Ldn2;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
