.class public final synthetic Lww5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:J

.field public final synthetic Z:J

.field public final synthetic f0:Z

.field public final synthetic g0:F

.field public final synthetic h0:S


# direct methods
.method public synthetic constructor <init>(Lkx4;JJIFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lww5;->X:Lkx4;

    .line 5
    .line 6
    iput-wide p2, p0, Lww5;->Y:J

    .line 7
    .line 8
    iput-wide p4, p0, Lww5;->Z:J

    .line 9
    .line 10
    iput-boolean p6, p0, Lww5;->f0:Z

    .line 11
    .line 12
    iput p7, p0, Lww5;->g0:F

    .line 13
    .line 14
    iput-short p8, p0, Lww5;->h0:S

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, Lww5;->h0:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lww5;->X:Lkx4;

    .line 18
    .line 19
    iget-wide v1, p0, Lww5;->Y:J

    .line 20
    .line 21
    iget-wide v3, p0, Lww5;->Z:J

    .line 22
    .line 23
    iget-boolean v5, p0, Lww5;->f0:Z

    .line 24
    .line 25
    iget v6, p0, Lww5;->g0:F

    .line 26
    .line 27
    invoke-static/range {v0 .. v8}, Lxw5;->c(Lkx4;JJIFLlp2;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    return-object p0
.end method
