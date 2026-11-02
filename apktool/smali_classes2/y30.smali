.class public final synthetic Ly30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Lo88;

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:I

.field public final synthetic h0:Z

.field public final synthetic i0:I

.field public final synthetic j0:I

.field public final synthetic k0:Lmx;

.field public final synthetic l0:I

.field public final synthetic m0:S


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly30;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ly30;->Y:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Ly30;->Z:Lo88;

    .line 9
    .line 10
    iput-object p4, p0, Ly30;->f0:Lgn2;

    .line 11
    .line 12
    iput p5, p0, Ly30;->g0:I

    .line 13
    .line 14
    iput-boolean p6, p0, Ly30;->h0:Z

    .line 15
    .line 16
    iput p7, p0, Ly30;->i0:I

    .line 17
    .line 18
    iput p8, p0, Ly30;->j0:I

    .line 19
    .line 20
    iput-object p9, p0, Ly30;->k0:Lmx;

    .line 21
    .line 22
    iput p10, p0, Ly30;->l0:I

    .line 23
    .line 24
    iput-short p11, p0, Ly30;->m0:S

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ly30;->l0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, Ly30;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Ly30;->Y:Lkx4;

    .line 20
    .line 21
    iget-object v2, p0, Ly30;->Z:Lo88;

    .line 22
    .line 23
    iget-object v3, p0, Ly30;->f0:Lgn2;

    .line 24
    .line 25
    iget v4, p0, Ly30;->g0:I

    .line 26
    .line 27
    iget-boolean v5, p0, Ly30;->h0:Z

    .line 28
    .line 29
    iget v6, p0, Ly30;->i0:I

    .line 30
    .line 31
    iget v7, p0, Ly30;->j0:I

    .line 32
    .line 33
    iget-object v8, p0, Ly30;->k0:Lmx;

    .line 34
    .line 35
    iget-short v11, p0, Ly30;->m0:S

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, Lwl7;->b(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;Llp2;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ldn8;->a:Ldn8;

    .line 41
    .line 42
    return-object p0
.end method
