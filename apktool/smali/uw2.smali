.class public final synthetic Luw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Z

.field public final synthetic f0:Z

.field public final synthetic g0:Lo88;

.field public final synthetic h0:B

.field public final synthetic i0:B

.field public final synthetic j0:I

.field public final synthetic k0:Z

.field public final synthetic l0:Z

.field public final synthetic m0:Lig5;

.field public final synthetic n0:Lx67;

.field public final synthetic o0:Ldw0;

.field public final synthetic p0:Ldw0;

.field public final synthetic q0:Ldn2;

.field public final synthetic r0:I

.field public final synthetic s0:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luw2;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Luw2;->Y:Lkx4;

    .line 7
    .line 8
    iput-boolean p3, p0, Luw2;->Z:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Luw2;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, Luw2;->g0:Lo88;

    .line 13
    .line 14
    iput-byte p6, p0, Luw2;->h0:B

    .line 15
    .line 16
    iput-byte p7, p0, Luw2;->i0:B

    .line 17
    .line 18
    iput p8, p0, Luw2;->j0:I

    .line 19
    .line 20
    iput-boolean p9, p0, Luw2;->k0:Z

    .line 21
    .line 22
    iput-boolean p10, p0, Luw2;->l0:Z

    .line 23
    .line 24
    iput-object p11, p0, Luw2;->m0:Lig5;

    .line 25
    .line 26
    iput-object p12, p0, Luw2;->n0:Lx67;

    .line 27
    .line 28
    iput-object p13, p0, Luw2;->o0:Ldw0;

    .line 29
    .line 30
    iput-object p14, p0, Luw2;->p0:Ldw0;

    .line 31
    .line 32
    iput-object p15, p0, Luw2;->q0:Ldn2;

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput p1, p0, Luw2;->r0:I

    .line 37
    .line 38
    move/from16 p1, p17

    .line 39
    .line 40
    iput p1, p0, Luw2;->s0:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

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
    iget v1, v0, Luw2;->r0:I

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
    iget v1, v0, Luw2;->s0:I

    .line 23
    .line 24
    invoke-static {v1}, Lw79;->P(I)I

    .line 25
    .line 26
    .line 27
    move-result v17

    .line 28
    iget-object v1, v0, Luw2;->X:Ljava/lang/String;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v0, Luw2;->Y:Lkx4;

    .line 32
    .line 33
    move-object v3, v2

    .line 34
    iget-boolean v2, v0, Luw2;->Z:Z

    .line 35
    .line 36
    move-object v4, v3

    .line 37
    iget-boolean v3, v0, Luw2;->f0:Z

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    iget-object v4, v0, Luw2;->g0:Lo88;

    .line 41
    .line 42
    move-object v6, v5

    .line 43
    iget-byte v5, v0, Luw2;->h0:B

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    iget-byte v6, v0, Luw2;->i0:B

    .line 47
    .line 48
    move-object v8, v7

    .line 49
    iget v7, v0, Luw2;->j0:I

    .line 50
    .line 51
    move-object v9, v8

    .line 52
    iget-boolean v8, v0, Luw2;->k0:Z

    .line 53
    .line 54
    move-object v10, v9

    .line 55
    iget-boolean v9, v0, Luw2;->l0:Z

    .line 56
    .line 57
    move-object v11, v10

    .line 58
    iget-object v10, v0, Luw2;->m0:Lig5;

    .line 59
    .line 60
    move-object v12, v11

    .line 61
    iget-object v11, v0, Luw2;->n0:Lx67;

    .line 62
    .line 63
    move-object v13, v12

    .line 64
    iget-object v12, v0, Luw2;->o0:Ldw0;

    .line 65
    .line 66
    move-object v14, v13

    .line 67
    iget-object v13, v0, Luw2;->p0:Ldw0;

    .line 68
    .line 69
    iget-object v0, v0, Luw2;->q0:Ldn2;

    .line 70
    .line 71
    move-object/from16 v18, v14

    .line 72
    .line 73
    move-object v14, v0

    .line 74
    move-object/from16 v0, v18

    .line 75
    .line 76
    invoke-static/range {v0 .. v17}, Lkm4;->g(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldn2;Llp2;II)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Ldn8;->a:Ldn8;

    .line 80
    .line 81
    return-object v0
.end method
