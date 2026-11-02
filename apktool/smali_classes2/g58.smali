.class public final synthetic Lg58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ld78;

.field public final synthetic Y:Ljava/lang/CharSequence;

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Lq58;

.field public final synthetic g0:Lsn2;

.field public final synthetic h0:Lrn2;

.field public final synthetic i0:Lrn2;

.field public final synthetic j0:Lrn2;

.field public final synthetic k0:Z

.field public final synthetic l0:Z

.field public final synthetic m0:Z

.field public final synthetic n0:Lxz4;

.field public final synthetic o0:Lgg5;

.field public final synthetic p0:Li48;

.field public final synthetic q0:Lzy0;

.field public final synthetic r0:I


# direct methods
.method public synthetic constructor <init>(Ld78;Ljava/lang/CharSequence;Lzy0;Lq58;Lsn2;Lrn2;Lrn2;Lrn2;ZZZLxz4;Lgg5;Li48;Lzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg58;->X:Ld78;

    .line 5
    .line 6
    iput-object p2, p0, Lg58;->Y:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput-object p3, p0, Lg58;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Lg58;->f0:Lq58;

    .line 11
    .line 12
    iput-object p5, p0, Lg58;->g0:Lsn2;

    .line 13
    .line 14
    iput-object p6, p0, Lg58;->h0:Lrn2;

    .line 15
    .line 16
    iput-object p7, p0, Lg58;->i0:Lrn2;

    .line 17
    .line 18
    iput-object p8, p0, Lg58;->j0:Lrn2;

    .line 19
    .line 20
    iput-boolean p9, p0, Lg58;->k0:Z

    .line 21
    .line 22
    iput-boolean p10, p0, Lg58;->l0:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lg58;->m0:Z

    .line 25
    .line 26
    iput-object p12, p0, Lg58;->n0:Lxz4;

    .line 27
    .line 28
    iput-object p13, p0, Lg58;->o0:Lgg5;

    .line 29
    .line 30
    iput-object p14, p0, Lg58;->p0:Li48;

    .line 31
    .line 32
    iput-object p15, p0, Lg58;->q0:Lzy0;

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput p1, p0, Lg58;->r0:I

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lg58;->r0:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lw79;->P(I)I

    .line 19
    .line 20
    .line 21
    move-result v16

    .line 22
    iget-object v1, v0, Lg58;->X:Ld78;

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    iget-object v1, v0, Lg58;->Y:Ljava/lang/CharSequence;

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    iget-object v2, v0, Lg58;->Z:Lzy0;

    .line 29
    .line 30
    move-object v4, v3

    .line 31
    iget-object v3, v0, Lg58;->f0:Lq58;

    .line 32
    .line 33
    move-object v5, v4

    .line 34
    iget-object v4, v0, Lg58;->g0:Lsn2;

    .line 35
    .line 36
    move-object v6, v5

    .line 37
    iget-object v5, v0, Lg58;->h0:Lrn2;

    .line 38
    .line 39
    move-object v7, v6

    .line 40
    iget-object v6, v0, Lg58;->i0:Lrn2;

    .line 41
    .line 42
    move-object v8, v7

    .line 43
    iget-object v7, v0, Lg58;->j0:Lrn2;

    .line 44
    .line 45
    move-object v9, v8

    .line 46
    iget-boolean v8, v0, Lg58;->k0:Z

    .line 47
    .line 48
    move-object v10, v9

    .line 49
    iget-boolean v9, v0, Lg58;->l0:Z

    .line 50
    .line 51
    move-object v11, v10

    .line 52
    iget-boolean v10, v0, Lg58;->m0:Z

    .line 53
    .line 54
    move-object v12, v11

    .line 55
    iget-object v11, v0, Lg58;->n0:Lxz4;

    .line 56
    .line 57
    move-object v13, v12

    .line 58
    iget-object v12, v0, Lg58;->o0:Lgg5;

    .line 59
    .line 60
    move-object v14, v13

    .line 61
    iget-object v13, v0, Lg58;->p0:Li48;

    .line 62
    .line 63
    iget-object v0, v0, Lg58;->q0:Lzy0;

    .line 64
    .line 65
    move-object/from16 v17, v14

    .line 66
    .line 67
    move-object v14, v0

    .line 68
    move-object/from16 v0, v17

    .line 69
    .line 70
    invoke-static/range {v0 .. v16}, Lpn7;->a(Ld78;Ljava/lang/CharSequence;Lzy0;Lq58;Lsn2;Lrn2;Lrn2;Lrn2;ZZZLxz4;Lgg5;Li48;Lzy0;Llp2;I)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Ldn8;->a:Ldn8;

    .line 74
    .line 75
    return-object v0
.end method
