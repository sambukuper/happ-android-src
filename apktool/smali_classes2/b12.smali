.class public final enum Lb12;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb12;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum X:Lb12;

.field public static final enum Y:Lb12;

.field public static final enum Z:Lb12;

.field public static final enum f0:Lb12;

.field public static final enum g0:Lb12;

.field public static final synthetic h0:[Lb12;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lb12;

    .line 2
    .line 3
    const-string v1, "RSA_1024"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lb12;->X:Lb12;

    .line 10
    .line 11
    new-instance v1, Lb12;

    .line 12
    .line 13
    const-string v2, "RSA_4096"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lb12;->Y:Lb12;

    .line 20
    .line 21
    new-instance v2, Lb12;

    .line 22
    .line 23
    const-string v3, "RSA_4096_2"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lb12;->Z:Lb12;

    .line 30
    .line 31
    new-instance v3, Lb12;

    .line 32
    .line 33
    const-string v4, "RSA_4096_3"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lb12;->f0:Lb12;

    .line 40
    .line 41
    new-instance v4, Lb12;

    .line 42
    .line 43
    const-string v5, "CRYPTO_5"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lb12;->g0:Lb12;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lb12;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lb12;->h0:[Lb12;

    .line 56
    .line 57
    new-instance v0, Ll99;

    .line 58
    .line 59
    const/16 v1, 0xc

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ll99;-><init>(B)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lb12;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    .line 66
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb12;
    .locals 1

    .line 1
    const-class v0, Lb12;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lb12;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lb12;
    .locals 1

    .line 1
    sget-object v0, Lb12;->h0:[Lb12;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lb12;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
