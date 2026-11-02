.class public final Lhl1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lve4;

.field public final b:Lvx4;

.field public final c:Lpz2;

.field public final d:Lis0;

.field public final e:Lvl;

.field public final f:Lwf5;

.field public final g:Lpz2;

.field public final h:Ll32;

.field public final i:Lqe4;

.field public final j:Lde2;

.field public final k:Ljava/lang/Iterable;

.field public final l:Lz47;

.field public final m:Lbe;

.field public final n:Li7;

.field public final o:Lpo5;

.field public final p:Lr62;

.field public final q:Lp45;

.field public final r:Ljava/util/List;

.field public final s:Lm22;

.field public final t:Los0;


# direct methods
.method public constructor <init>(Lve4;Lvx4;Lis0;Lvl;Lwf5;Ll32;Lde2;Ljava/lang/Iterable;Lz47;Li7;Lpo5;Lr62;Lp45;Lg55;Ljava/util/List;Lm22;)V
    .locals 3

    .line 1
    sget-object v0, Lpz2;->I0:Lpz2;

    .line 2
    .line 3
    sget-object v1, Lpz2;->Y0:Lpz2;

    .line 4
    .line 5
    sget-object v2, Lqe4;->Z:Lqe4;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lhl1;->a:Lve4;

    .line 23
    .line 24
    iput-object p2, p0, Lhl1;->b:Lvx4;

    .line 25
    .line 26
    iput-object v0, p0, Lhl1;->c:Lpz2;

    .line 27
    .line 28
    iput-object p3, p0, Lhl1;->d:Lis0;

    .line 29
    .line 30
    iput-object p4, p0, Lhl1;->e:Lvl;

    .line 31
    .line 32
    iput-object p5, p0, Lhl1;->f:Lwf5;

    .line 33
    .line 34
    iput-object v1, p0, Lhl1;->g:Lpz2;

    .line 35
    .line 36
    iput-object p6, p0, Lhl1;->h:Ll32;

    .line 37
    .line 38
    iput-object v2, p0, Lhl1;->i:Lqe4;

    .line 39
    .line 40
    iput-object p7, p0, Lhl1;->j:Lde2;

    .line 41
    .line 42
    iput-object p8, p0, Lhl1;->k:Ljava/lang/Iterable;

    .line 43
    .line 44
    iput-object p9, p0, Lhl1;->l:Lz47;

    .line 45
    .line 46
    sget-object p1, Lt51;->a:Lbe;

    .line 47
    .line 48
    iput-object p1, p0, Lhl1;->m:Lbe;

    .line 49
    .line 50
    iput-object p10, p0, Lhl1;->n:Li7;

    .line 51
    .line 52
    iput-object p11, p0, Lhl1;->o:Lpo5;

    .line 53
    .line 54
    iput-object p12, p0, Lhl1;->p:Lr62;

    .line 55
    .line 56
    move-object/from16 p1, p13

    .line 57
    .line 58
    iput-object p1, p0, Lhl1;->q:Lp45;

    .line 59
    .line 60
    move-object/from16 p1, p15

    .line 61
    .line 62
    iput-object p1, p0, Lhl1;->r:Ljava/util/List;

    .line 63
    .line 64
    move-object/from16 p1, p16

    .line 65
    .line 66
    iput-object p1, p0, Lhl1;->s:Lm22;

    .line 67
    .line 68
    new-instance p1, Los0;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Los0;-><init>(Lhl1;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lhl1;->t:Los0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Lve4;Lvx4;Lvk1;Ldq;Lwf5;Ljava/lang/Iterable;Lz47;Li7;Lpo5;Lr62;Lp45;Lg55;I)V
    .locals 17

    sget-object v7, Lpz2;->R0:Lpz2;

    sget-object v0, Loy1;->G0:Loy1;

    const/high16 v1, 0x10000

    and-int v1, p13, v1

    if-eqz v1, :cond_0

    .line 76
    sget-object v1, Lp45;->b:Lo45;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    sget-object v1, Lo45;->b:Lq45;

    move-object v13, v1

    goto :goto_0

    :cond_0
    move-object/from16 v13, p11

    .line 78
    :goto_0
    sget-object v1, Lqg1;->a:Lqg1;

    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/high16 v1, 0x80000

    and-int v1, p13, v1

    if-eqz v1, :cond_1

    .line 79
    sget-object v0, Lpz2;->O0:Lpz2;

    :cond_1
    move-object/from16 v16, v0

    .line 80
    sget-object v6, Ll32;->n:Lk32;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v14, p12

    invoke-direct/range {v0 .. v16}, Lhl1;-><init>(Lve4;Lvx4;Lis0;Lvl;Lwf5;Ll32;Lde2;Ljava/lang/Iterable;Lz47;Li7;Lpo5;Lr62;Lp45;Lg55;Ljava/util/List;Lm22;)V

    return-void
.end method
