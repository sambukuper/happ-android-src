.class public final synthetic Lve;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:J

.field public final synthetic g0:Lay6;

.field public final synthetic h0:Lor5;

.field public final synthetic i0:Lx67;

.field public final synthetic j0:J

.field public final synthetic k0:F

.field public final synthetic l0:Lzy0;

.field public final synthetic m0:I


# direct methods
.method public synthetic constructor <init>(ZLdn2;Lkx4;JLay6;Lor5;Lx67;JFLzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lve;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lve;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p3, p0, Lve;->Z:Lkx4;

    .line 9
    .line 10
    iput-wide p4, p0, Lve;->f0:J

    .line 11
    .line 12
    iput-object p6, p0, Lve;->g0:Lay6;

    .line 13
    .line 14
    iput-object p7, p0, Lve;->h0:Lor5;

    .line 15
    .line 16
    iput-object p8, p0, Lve;->i0:Lx67;

    .line 17
    .line 18
    iput-wide p9, p0, Lve;->j0:J

    .line 19
    .line 20
    iput p11, p0, Lve;->k0:F

    .line 21
    .line 22
    iput-object p12, p0, Lve;->l0:Lzy0;

    .line 23
    .line 24
    iput p13, p0, Lve;->m0:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, Llp2;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lve;->m0:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, Lw79;->P(I)I

    .line 16
    .line 17
    .line 18
    move-result v13

    .line 19
    iget-boolean v0, p0, Lve;->X:Z

    .line 20
    .line 21
    iget-object v1, p0, Lve;->Y:Ldn2;

    .line 22
    .line 23
    iget-object v2, p0, Lve;->Z:Lkx4;

    .line 24
    .line 25
    iget-wide v3, p0, Lve;->f0:J

    .line 26
    .line 27
    iget-object v5, p0, Lve;->g0:Lay6;

    .line 28
    .line 29
    iget-object v6, p0, Lve;->h0:Lor5;

    .line 30
    .line 31
    iget-object v7, p0, Lve;->i0:Lx67;

    .line 32
    .line 33
    iget-wide v8, p0, Lve;->j0:J

    .line 34
    .line 35
    iget v10, p0, Lve;->k0:F

    .line 36
    .line 37
    iget-object v11, p0, Lve;->l0:Lzy0;

    .line 38
    .line 39
    invoke-static/range {v0 .. v13}, Lye;->a(ZLdn2;Lkx4;JLay6;Lor5;Lx67;JFLzy0;Llp2;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Ldn8;->a:Ldn8;

    .line 43
    .line 44
    return-object p0
.end method
