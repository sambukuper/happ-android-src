.class public final Lrk8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lrk8;


# instance fields
.field public a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    new-instance v2, Lrk8;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, v2, Lrk8;->a:[I

    .line 18
    .line 19
    sput-object v2, Lrk8;->b:Lrk8;

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :array_0
    .array-data 4
        -0x1120a684
        -0x21224211
        0x15943f3f
        0xe00d580
        -0x4ff6a400
        0x15fb9f
        0x781c068d
        0x340400f
        -0xbd4e300
        -0x2b07ebf
        0x25d7fffc
        0x100084b
        0x538f3c40
        0x40000001    # 2.0000002f
        -0x20eaf00
        -0x60448519
        0x410419a
        0x408557
        0x4002
        0x100001
        0x400408
        0x1
    .end array-data
.end method
