.class public final Llc3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llh7;


# instance fields
.field public X:Ljava/lang/Float;

.field public Y:Ljava/lang/Float;

.field public final Z:Lrh5;

.field public f0:Lt18;

.field public g0:Z

.field public h0:Z

.field public i0:J

.field public final synthetic j0:Lnc3;


# direct methods
.method public constructor <init>(Lnc3;Ljava/lang/Float;Ljava/lang/Float;Lkc3;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llc3;->j0:Lnc3;

    .line 5
    .line 6
    iput-object p2, p0, Llc3;->X:Ljava/lang/Float;

    .line 7
    .line 8
    iput-object p3, p0, Llc3;->Y:Ljava/lang/Float;

    .line 9
    .line 10
    invoke-static {p2}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Llc3;->Z:Lrh5;

    .line 15
    .line 16
    new-instance v0, Lt18;

    .line 17
    .line 18
    iget-object v3, p0, Llc3;->X:Ljava/lang/Float;

    .line 19
    .line 20
    iget-object v4, p0, Llc3;->Y:Ljava/lang/Float;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    sget-object v2, Lys0;->j0:Lug8;

    .line 24
    .line 25
    move-object v1, p4

    .line 26
    invoke-direct/range {v0 .. v5}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Llc3;->f0:Lt18;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Llc3;->Z:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
