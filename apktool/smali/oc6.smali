.class public final Loc6;
.super Lv2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Loc6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final X:Ljava/lang/String;

.field public final Y:Ljava/lang/String;

.field public final Z:Ljava/lang/String;

.field public final f0:Ljava/lang/String;

.field public final g0:Ljava/lang/String;

.field public h0:I

.field public final i0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llg7;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Llg7;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Loc6;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loc6;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Loc6;->Y:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Loc6;->Z:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Loc6;->f0:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Loc6;->g0:Ljava/lang/String;

    .line 13
    .line 14
    const-string p1, "fcm-25.1.3"

    .line 15
    .line 16
    iput-object p1, p0, Loc6;->i0:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Loc6;->X:Ljava/lang/String;

    iput-object p2, p0, Loc6;->Y:Ljava/lang/String;

    iput-object p3, p0, Loc6;->Z:Ljava/lang/String;

    iput-object p4, p0, Loc6;->f0:Ljava/lang/String;

    iput-object p5, p0, Loc6;->g0:Ljava/lang/String;

    iput p6, p0, Loc6;->h0:I

    iput-object p7, p0, Loc6;->i0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, Lmb6;->s0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x1

    .line 8
    iget-object v1, p0, Loc6;->X:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    iget-object v1, p0, Loc6;->Y:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    iget-object v1, p0, Loc6;->Z:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, v0, v1}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Loc6;->f0:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-static {p1, v1, v0}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    iget-object v2, p0, Loc6;->g0:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1, v0, v2}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Loc6;->h0:I

    .line 38
    .line 39
    const/4 v2, 0x6

    .line 40
    invoke-static {p1, v2, v1}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    iget-object p0, p0, Loc6;->i0:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, v0, p0}, Lmb6;->n0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Lmb6;->t0(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
